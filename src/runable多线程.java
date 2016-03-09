import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xujiabin on 2016/3/6 0006.
 */
public class runable多线程 implements Runnable {
    private String name;

    public runable多线程(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        Date date = new Date();
        DateFormat ddtf = DateFormat.getDateTimeInstance();
        System.out.println(ddtf.format(date)+" "+name);
        try {
            Thread.sleep(1000);//括号里面的5000代表5000毫秒，也就是5秒，可以该成你需要的时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String i:list) {
            Runnable runnable = new runable多线程(i);
            Thread thread = new Thread(runnable);
            thread.start();
        }

    }

}

