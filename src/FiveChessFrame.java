/**
 * Created by xujiabin on 2016/3/7 0007.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FiveChessFrame extends JFrame implements MouseListener {

    int width = Toolkit.getDefaultToolkit().getScreenSize().width;//屏幕宽度
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;//屏幕高度
    int[][] allChess = new int[19][19];//用来保存全部棋子
    boolean canPlay = true;//判断游戏是否能继续
    int x = 0;//棋子的坐标
    int y = 0;
    boolean isBlack = true;//判断当前棋子的颜色

    //对窗口进行初始化
    public FiveChessFrame() {
        setTitle("五子棋");
        setSize(500, 500);
        setLocation((width - 500) / 2, (height - 500) / 2);
        setResizable(false);
        addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //画五子棋
    public void paint(Graphics g) {
        g.setFont(new Font("黑体", Font.BOLD, 20));
        g.drawString("游戏信息", 120, 60);
        g.setFont(new Font("宋体", Font.BOLD, 12));
        g.drawString("黑方时间", 60, 480);
        g.drawString("白方时间", 260, 480);

        //画棋盘
        //画19条横线
        int y_index = 0;
        for (int i = 0; i < 19; i++) {
            g.drawLine(12, 73 + y_index, 372, 73 + y_index);
            y_index += 20;
        }

        //画19条纵线
        int x_index = 0;
        for (int i = 0; i < 19; i++) {
            g.drawLine(12 + x_index, 73, 12 + x_index, 433);
            x_index += 20;
        }

        //画四个点
        g.fillOval(70, 131, 4, 4);
        g.fillOval(310, 131, 4, 4);
        g.fillOval(70, 371, 4, 4);
        g.fillOval(310, 371, 4, 4);

        //画全部棋子
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (this.allChess[i][j] == 1) {
                    //画黑子
                    int tempX = i * 20 + 12;
                    int tempY = j * 20 + 73;
                    g.fillOval(tempX - 7, tempY - 7, 14, 14);
                }
                if (this.allChess[i][j] == 2) {
                    //画白子
                    int tempX = i * 20 + 12;
                    int tempY = j * 20 + 73;
                    g.setColor(Color.WHITE);
                    g.fillOval(tempX - 7, tempY - 7, 14, 14);
                    g.setColor(Color.BLACK);
                    g.drawOval(tempX - 7, tempY - 7, 14, 14);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        if (canPlay == false) {
            return;
        }
        System.out.println(e.getX() + "---" + e.getY());
        x = e.getX();
        y = e.getY();
        if (x >= 12 && x <= 372 && y >= 73 && y < 433) {
            x = (x - 12) / 19;
            y = (y - 73) / 19;
            if (allChess[x][y] == 0) {
                if (this.isBlack == true) {
                    allChess[x][y] = 1;
                    isBlack = false;
                } else {
                    allChess[x][y] = 2;
                    isBlack = true;
                }
                //判断这个棋子是否和其他棋子连成5个
                boolean winFlag = this.Check_Win();
                if (winFlag) {
                    JOptionPane.showMessageDialog(this, "游戏结束,"
                            + (allChess[x][y] == 1 ? "黑方" : "白方") + "获胜");
                    canPlay = false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "当前已有棋子,不能再下了!");
            }

            this.repaint();
        }
    }

    //判断是否获胜
    private boolean Check_Win() {
        boolean flag = false;
        //保存共有多少相同颜色的棋子相连
        int count = 1;
        //先判断横向,特点，y坐标相同，即allChess[x][y]中y相同
        //判断这个棋子的颜色
        int color = this.allChess[x][y];
        count = Check_Count(1, 0, color);
        if (count >= 5) {
            flag = true;
        } else {
            //判断纵向
            count = Check_Count(0, 1, color);
            if (count >= 5) {
                flag = true;
            } else {
                //判断右上，左下
                count = Check_Count(1, -1, color);
                if (count >= 5) {
                    flag = true;
                } else {
                    //判断左上，右下
                    count = Check_Count(1, 1, color);
                    if (count >= 5) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    //得到棋子的数目
    private int Check_Count(int xChange, int yChange, int color) {
        int count = 1;
        int tempX = xChange;
        int tempY = yChange;
        while (color == this.allChess[x + xChange][y + yChange]) {
            count++;
            if (xChange != 0) {
                xChange++;
            }
            if (yChange != 0) {
                if (yChange > 0)
                    yChange++;
                if (yChange < 0)
                    yChange--;
            }
        }
        xChange = tempX;
        yChange = tempY;
        while (color ==

                this.allChess[x - xChange][y - yChange]) {
            count++;
            if (xChange != 0) {
                xChange++;
            }
            if (yChange != 0) {
                if (yChange > 0)
                    yChange++;
                if (yChange < 0)
                    yChange--;
            }
        }
        return count;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}

//测试类
class Test {
    public static void main(String[] args){
        new FiveChessFrame();
    }
}
