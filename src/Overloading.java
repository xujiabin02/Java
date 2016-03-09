/**
 * Created by xujiabin on 2015/12/21 0021.
 */

public class Overloading {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        t1.info();
        t1.info("Overloading method");
        Tree t2 = new Tree(5);
        t2.info();
        t2.info("Overloading method");
    }
}
class Tree {
    int height;

    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }

    Tree(int i) {
        System.out.println("Creating new Tree that is " + i + " feet tall");
        height = i;
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}