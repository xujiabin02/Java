package fengzhuang;

/**
 * Created by xujiabin on 2015/12/23 0023.
 */
class file {
    private String filename = "word.java";
    private int size = 1024;
    private String path = "/opt/app/";

    String getName() {
        return filename;
    }

    public int getsize() {
        return size;
    }

    public String getPath() {
        return path;
    }
}

class exefile extends file {
    String filename = "word.class";
    String type = "java";

    String getType() {
        return type;
    }

    String getName() {
        return filename;
    }

    String getName(String NewName) {
        filename = NewName;
        return filename;
    }
}

public class fengzhuang {
    public static void main(String[] args) {
        exefile exetest = new exefile();
        System.out.println(exetest.getName());
        System.out.println(exetest.getName("HelloWord.java"));
        System.out.println(exetest.getType());
        System.out.println(exetest.getPath());

    }

}

