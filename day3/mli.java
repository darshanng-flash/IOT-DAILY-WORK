// Multilevel Inheritance
package day3;

class Parent {
    String name;
    int age;
    int roll;

    Parent(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    void display() {
        System.out.print(name + " " + age + " " + roll + " ");
    }
}

class Child extends Parent {

    Child(String name, int age, int roll) {
        super(name, age, roll);
    }

    void show() {
        super.display();
    }
}

class SubChild extends Child{
    int contact;

    SubChild(String name, int age, int roll, int contact) {
        super(name, age, roll);
        this.contact = contact;
    }

    void show1() {
        System.out.print(name + " " + age + " " + roll + " " + contact);
    }
}

public class mli {
    public static void main(String[] args) {
        SubChild c = new SubChild("Rohit", 20, 101, 1234567890);
        c.show1();
    }
}