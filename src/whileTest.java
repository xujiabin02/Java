import java.io.IOException;

/**
 * Created by xujiabin on 2015/12/19 0019.
 */
public class whileTest {
    public static void main(String[] args) {
        char ch='a';
        while(ch!='C') {
            try {
                ch = (char) System.in.read();
                System.out.println(ch);
            } catch (IOException e) {
            }
        }
    }
}
