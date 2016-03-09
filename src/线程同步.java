/**
 * Created by xujiabin on 2016/3/6 0006.
 */
public class 线程同步 implements Runnable {
    private int number = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ":" + number++);
            }
        }
    }

    public static void main(String[] args) {
        线程同步 run = new 线程同步();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
    }
}
