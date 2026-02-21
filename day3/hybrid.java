//hybrid inheritence
package day3;
interface School{
    void SchoolName();
}

// Renamed to avoid clashing with other Student classes in package day3
class HybridStudent{
    String name;
    HybridStudent(String name){
        this.name=name;
    }
}

class ClassISE extends HybridStudent implements School{
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
    