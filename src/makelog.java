/**
 * Created by xujiabin on 2016/3/2 0002.
 */
import java.io.*;
import java.lang.*;

public class makelog {
    String Filename;
    public static void ReadFileByLine(String FilePath) {
        File file = new File(FilePath);
        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        }

    public static void WriteFileByLine(String FilePath,String temp){
        File file=new File(FilePath);
        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        try {
            // FileReader:用来读取字符文件的便捷类。
            if(!file.exists()){file.createNewFile();}
            bufWriter = new BufferedWriter(new FileWriter(file));
            // buf = new BufferedReader(new InputStreamReader(new
            // FileInputStream(file)));
            bufWriter.write(temp + "\n");
        } catch (Exception e) {
            e.getStackTrace();
            }
    }
    public static void main(String[] args) {
        for(int a=0;a<=1000;a++){
            String b=String.valueOf(a);
            WriteFileByLine("read.txt",b);}

    }
}
