//area and perimeter
package day3;

 class Area {
    int L,B;
         Area(int L, int B){
            this.L = L;
            this.B = B;
        }
    int area(){
        return L * B;
    }
    
     int perimeter(){
        return 2 * (L + B);
    }
   

}

public class PR1 {
      public static void main(String[] args){
        Area obj= new Area(10, 20);
        System.out.println(obj.area());    
        System.out.println(obj.perimeter());
    }
}
