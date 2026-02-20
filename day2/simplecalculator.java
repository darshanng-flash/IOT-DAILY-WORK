package day2;

public class simplecalculator {
    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("Addition: "+add(a,b));
        System.out.println("Subtraction: "+sub(a,b));
        System.out.println("Multiplication: "+mul(a,b));
        System.out.println("Division: "+div(a,b));
    }

}
