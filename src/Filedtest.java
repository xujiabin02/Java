//import java.text.SimpleDateFormat;

/**
 * Created by xujiabin on 2015/12/19 0019.
 */
public class Filedtest {
    public static void main(String[] args) {
        SimpleDate md1=new SimpleDate(2007,5,12);
        SimpleDate md2=new SimpleDate(2008,8,8);
        SimpleDate md3=new SimpleDate(2008,5,15);
        Employee emp1=new Employee("李明","男",23,1500,md1);
        Employee emp2=new Employee("张小琳","女",20,1200,md2);
        Employee emp3=new Employee("许小山","男",18,1800,md3);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);
    }
}
class Employee {
    String name;
    String gender;
    int age;
    double salary;
    SimpleDate enrollDate;

    Employee(String name,String gender,int age,double salary,SimpleDate enrollDate) {
        this.name=name;
        if(gender!="男" && gender!="女") {
            System.out.println("性别有误！");
        }
        else {
            this.gender=gender;
        }
        if(age>18&&age<=60) {
            this.age=age;
        }
        else {
            System.out.println(name+": 年龄有误！");
        }
        this.salary=salary;
        this.enrollDate=enrollDate;
    }
    public String toString() {
        String str;
        str="姓名: "+name
                +"\n性别: "+gender
                +"\n年龄: "+age
                +"\n工资: "+salary
                +"\n任职时间: "+enrollDate.toString();
        return str;
    }
}
class SimpleDate {
    int year;
    int month;
    int day;
    SimpleDate(int y,int m,int d) {
        year=y;
        month=m;
        day=d;
    }
    public String toString() {
        return year+"年"+month+"月"+day+"日";
    }
}

