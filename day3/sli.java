//single level inheritence
package day3;
class Parent{
    String name;
    int age;
    Parent(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.print(name+" "+age);
    }
}
class Child extends Parent{
    int roll;
    Child(String name, int age, int roll){
        super(name, age);
        this.roll = roll;
    }
    void display(){
        super.display();
        System.out.print(" "+roll);
    }
}
public class sli {
    public static void main(String[] args){
        Child obj = new Child("Pari", 20, 101);
        obj.display();
    }
}
