import java.util.Date;

/**
 * Created by xujiabin on 2016/3/6 0006.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date now = new Date();
        Long m = System.currentTimeMillis()+5000;
        Date otherDate = new Date(m);
        if (otherDate.after(now)) {
            System.out.println("之后");
        } else {
            System.out.println("之前");
        }
    }
}
