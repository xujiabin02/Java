import java.util.ArrayList;

/**
 * Created by xujiabin on 2016/3/6 0006.
 */
public class ListTest {
    public static void main(String[] args) {
//        ArrayList<String> List = ["A","B","C"];
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        for (String i : list) {
            System.out.println(i);
        }
    }
}


