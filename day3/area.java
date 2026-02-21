package day3;
class Shape{
    int l,b,h;
    Shape(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    int area(){
        return l * b;
    }
    int perimeter(){
        return 2 * (l + b);
    }
    int tri(){
        return (int)(0.5*(h*b));
    }

}
class Triangle extends Shape{
    Triangle(int l,int b,int h){
        super(l,b,h);
    }
}
class Rectangle extends Shape{
    Rectangle(int l,int b){
        super(l,b,0);
    }
}
public class area {
    public static void main(String[] args) {
        Triangle t=new Triangle(10,20,30);
        Rectangle r=new Rectangle(10,20);
        System.out.println("Area of triangle: "+t.tri());
        
        System.out.println("Area of rectangle: "+r.area());
        System.out.println("Perimeter of rectangle: "+r.perimeter());   
    }
}
