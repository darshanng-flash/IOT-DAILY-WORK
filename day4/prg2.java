package day4;
interface Student{
    void Show();
}
class Child implements Student{
    String name;
    int age;
    Child(String name,int age){
        this.name=name;
        this .age=age;
    }
    public void Show(){
        System.out.print(name+" "+age);
    }
}
public class prg2 {
    public static void main(String[] args) {
        Child s=new Child("Chinnu",21);
        s.Show();
    }
}