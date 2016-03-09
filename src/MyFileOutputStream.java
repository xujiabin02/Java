import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by xujiabin on 2016/3/3 0003.
 */
public class MyFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("D:\\cc.txt");
        BufferedOutputStream his = new BufferedOutputStream(out);
        String s = "I want code java";
        his.write(s.getBytes());
        his.flush();
        his.close();
    }
}
