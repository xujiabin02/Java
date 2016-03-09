/**
 * Created by xujiabin on 2016/1/14 0014.
 */
import java.io.*;
public class Hello {
    public static void main(String[] args) throws IOException{
        MyFileInputWriter.wfile("dd.txt", "套一世A股，还一生房贷.\n","1");
        MyFileInputWriter.rfile("dd.txt");
        if (args.length > 0) {
            String a = args[0];
            dfPrintln(a);
        }}

    static void dfPrint(String val) {

        if (val == null) {
            val = "null";
        }

        System.out.print(val);
    }

    static void dfPrintln(String val) throws IOException{
        dfPrint(val);
        System.out.println();
    }
}
