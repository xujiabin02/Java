import java.io.*;

/**
 * Created by xujiabin on 2016/3/3 0003.
 */
public class MyFileInputWriter {
    /**
     * wfile 双参数
     * @param Filename
     * @param content
     * @throws IOException
     */
    public static void wfile(String Filename, String content) throws IOException {
        File file = new File(Filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = new FileWriter(Filename);
        fw.write(content);
        fw.close();
     }

    /**
     * wfile 三参数，增加"a"(追加写入)
     * @param Filename
     * @param content
     * @param a
     * @throws IOException
     */
    public static void wfile(String Filename, String content,String a) throws IOException {
        File file = new File(Filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = new FileWriter(Filename, true);
        fw.write(content);
        fw.close();
    }
    public static void rfile(String Filename) throws IOException {
        File file=new File(Filename);
        if(!file.exists()||file.isDirectory())
            throw new FileNotFoundException();
        BufferedReader br=new BufferedReader(new FileReader(file));
        String temp=null;
        StringBuffer sb=new StringBuffer();
        temp=br.readLine();
        while(temp!=null) {
            sb.append(temp+"\n");
            temp=br.readLine();
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) throws IOException {
        String aFile = "dd.txt";
        String someword = "To be a better man!\n";
        wfile(aFile, someword);
    }
}
