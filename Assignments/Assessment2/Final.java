// FinalDemo.java
final class FinalClass {
    final int x = 10;

    final void show() {
        System.out.println("Final method executed. x = " + x);
    }
}

public class Final {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}