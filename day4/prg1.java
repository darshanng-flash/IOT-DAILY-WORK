package day4;
//abstract

abstract class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    abstract void Show();
}
class Child extends Student{
    int roll;
    Child(String name,int age,int roll){
        super(name,age);
        this.roll=roll;
    }
    void Show(){
        System.out.print(name+" "+age+" "+roll);
    }
}
public class prg1 {
    public static void main(String[] args) {
        Child c= new Child("Pari",21,70);
        c.Show();
    }
}
