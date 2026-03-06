// GarbageCollectionDemo.java
public class garbagecoll {

    protected void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        garbagecoll obj1 = new garbagecoll();
        garbagecoll obj2 = new garbagecoll();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
