/**
 * Created by xujiabin on 2016/3/5 0005.
 */
import java.util.Scanner;

public class 加密 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个英文字符串或解密字符串：");
        String password = scan.nextLine();
        char[] array = password.toCharArray();
        for (int i=0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ 31123);
//            System.out.println(array[i]);
        }
        System.out.println("加密或解密结果如下: \n "+ new String(array));
        System.out.println("\"A\"");
        String str = "你好,小婊砸";
        System.out.println(str.replace("婊砸","贱人"));
    }

}
