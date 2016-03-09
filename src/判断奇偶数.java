/**
 * Created by xujiabin on 2016/3/5 0005.
 */
import java.util.Scanner;

public class 判断奇偶数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        long number = scan.nextLong();
        String check = (number % 2 == 0) ? "您输入的数字是：偶数" : "您输入的数字是：奇数";
        System.out.println(check);
    }

}
