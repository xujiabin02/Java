import java.text.DateFormat;
import java.util.Date;

/**
 * Created by xujiabin on 2016/3/5 0005.
 */
public class PrintDate {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat ddtf = DateFormat.getDateTimeInstance();
        System.out.println(ddtf.format(date));
    }
}
