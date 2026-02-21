//hirarchical inheritance
package day3;
class Parent {
    String name;
    int age;
    int roll;

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.print(name + " " + age );
    }
}

class Child1 extends Parent {
    int roll;
    Child1(String name, int age, int roll) {
        super(name, age);
        this.roll=roll;

    }

    void show() {
        System.out.print(name+" "+age+" "+roll);
    }
}

class Child2 extends Parent {
    int contact;
    Child2(String name, int age,int contact) {
        super(name, age);
        this.contact = contact;
    }

    void show1() {
        System.out.print(name + " " + age + " " + contact);
    }
}


public class hin {
    public static void main(String[] args) {
        Child1 c=new Child1("ABC",21,30);
        c.show();
        System.out.println("\t");
        Child2 c2=new Child2("bca",40,32);
        c2.show1();
    }

}
