package day3;
class Student{
    private String name;
    private int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Student s=new Student("MANJA",21);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.setName("gunda");
        s.setAge(22);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

