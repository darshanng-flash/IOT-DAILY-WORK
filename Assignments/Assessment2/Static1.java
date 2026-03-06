// StaticDemo.java
class Student {
    int roll;
    String name;
    static String college = "ABC College";

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    static void changeCollege() {
        college = "XYZ College";
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class Static1 {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student(1, "Dee");
        Student s2 = new Student(2, "Sam");

        s1.display();
        s2.display();
    }
}
