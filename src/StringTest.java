import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xujiabin on 2015/12/19 0019.
 */
public class StringTest {
    public static void main(String[] args) {
        String bab = new String();
        StringBuffer cab;
        while (bab != "abc") {
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                cab = new StringBuffer(input.readLine());
                System.out.println(cab);
            } catch (IOException e) {
            }

        }
    }
}
