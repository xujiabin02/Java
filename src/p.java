import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by xujiabin on 2016/3/8 0008.
 */
public class p {
    public static void main(String[] args) throws IOException{
        Properties ps = System.getProperties();
        System.out.println(ps.getProperty("java.class.path"));
        System.out.println(ps.getProperty("os.name"));
        System.out.println(ps.getProperty("pidfile"));
        System.out.println(ps.getProperty("mode"));
        File Pfile = new File("F:\\Java practice\\dd.txt");
        System.out.println(Pfile.getParentFile());
    }
}
