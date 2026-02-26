package day4;
//abstract

abstract class Student2{
    String name;
    int age;
    Student2(String name,int age){
        this.name=name;
        this.age=age;
    }
    abstract void Show();
}
class Child1 extends Student2{
    int roll;
    Child1(String name,int age,int roll){
        super(name,age);
        this.roll=roll;
    }
    void Show(){
        System.out.print(name+" "+age+" "+roll);
    }
}
public class prg1 {
    public static void main(String[] args) {
        Child1 c= new Child1("Pari",21,70);
        c.Show();
    }
}
