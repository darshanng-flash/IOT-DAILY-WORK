
//multiple inheritance/diamond problrm
package day3;
interface A{
    void show();
}
interface B{
    void show();
}

class C implements A,B{
    public void show(){
        System.out.println("Diamond Solution");
    }
}

public class mulin {
    public static void main(String[] args) {
        C c=new C();
        c.show();
    }
}
