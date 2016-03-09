/**
 * Created by xujiabin on 2015/12/19 0019.
 */

import java.io.*;
public class st {
    public static void main(String[] args) {
        char ch;
        try{
            System.out.print("input the grade(A,B,C):");
            ch=(char)System.in.read();
            switch (ch) {
                case 'A':System.out.print("85-100");
                    break;
                case 'B':System.out.print("60-84");
                    break;
                case 'C':System.out.print("0-59");
                    break;
                default:System.out.print("输入有误");
            }
        } catch (IOException e) {}
    }
}
