/**
 * Created by xujiabin on 2015/12/25 0025.
 */
public class chengTest {
    public static void main(String[] args) {
        class cheng {
            int Nu;
            String name;

            int cheng(int NewNu) {
                Nu = NewNu * NewNu;
                return Nu;
            }

            String cheng(String NewName) {
                name = NewName;
                return name;
            }
        }
        cheng cc = new cheng();
        System.out.println(cc.cheng(3));
        System.out.println(cc.cheng("hello"));
    }
}
