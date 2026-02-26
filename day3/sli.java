//single level inheritence
package day3;
class Parent3{
    String name;
    int age;
    Parent3(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.print(name+" "+age);
    }
}
class Child6 extends Parent2{
    int roll;
    Child6(String name, int age, int roll){
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
