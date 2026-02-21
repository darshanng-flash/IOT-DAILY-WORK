//multilevel inheritence
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
class Child extends Parent{ int roll;
    Child(String name, int age, int roll){
        super(name, age);
        this.roll = roll;
    }
    void show(){
        super.display();
        System.out.print(name+" "+age+" "+roll);
    }
class SubChild extends Child{
    int contact;
    SubChild(String name,int age,int roll,int contact){
        super(name,age,roll);
        this.contact = contact;
    }
    void show1(){
        System.out.print(name+" "+age+" "+roll+" "+contact);
    
    }
}

public class mli {
    public static void main(String[] args) {
        SubChild c= new SubChild("Rohit", 20, 101, 1234567890);
        c.show1();
    }
}
}