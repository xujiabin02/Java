/**
 * Created by xujiabin on 2015/12/19 0019.
 */
public class PerfectTest {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i < 10000; i++) {
            if (PerfectNumber.isPerfect(i)) {
                System.out.println(i + "\t");
                count++;
                if (count % 5 == 0)
                    System.out.println();
            }
        }
    }
}
class PerfectNumber {
    static boolean isPerfect(int n) {
        int x=0;
        for(int i=1;i<=n/2;i++) {
            if(n%i==0)  {
                x+=i;
            }
        }
        if(x==n) {
            return true;
        }
        else {
            return false;
        }
    }
}