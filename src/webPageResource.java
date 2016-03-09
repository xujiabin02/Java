/**
 * Created by xujiabin on 2016/2/6 0006.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class webPageResource {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        webPageResource t6=new webPageResource();
        String htmls= t6.getPageSource("http://120.27.196.204:8983/solr/new-core/select?q=*%3A*&wt=json&indent=true","UTF-8");
        System.out.println(htmls);
    }

    public String getPageSource(String pageUrl,String encoding) {
        StringBuffer sb = new StringBuffer();
        try {
            //构建一URL对象
            URL url = new URL(pageUrl);
            //使用openStream得到一输入流并由此构造一个BufferedReader对象
            BufferedReader in = new BufferedReader(new InputStreamReader(url
                    .openStream(), encoding));
            String line;
            //读取www资源
            while ((line = in.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            in.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return sb.toString();
    }

}