//hybrid inheritence
package day3;
interface School{
    void SchoolName();
}
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
class ClassISE extends Student implements School{
    int roll;
    ClassISE(String name, int roll){
        super(name);
        this.roll=roll;
    }
    public void SchoolName(){
        System.out.println("abc School");
    }
    void show(){
        System.out.println(name+" "+roll);
    }

}
public class hybrid {
    public static void main(String[] args) {
        ClassISE s=new ClassISE("XYZ",101);
        s.SchoolName();
        s.show();
    }
}
    