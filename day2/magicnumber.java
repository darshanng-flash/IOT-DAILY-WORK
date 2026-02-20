public class magicnumber {
    public static void main(String[] args){
        int num=18;
        int sum=0;
        while(num>9){
            sum=0;
            while(num>0){
                sum=sum+(num%10);
                num=num/10;
            }
            num=sum;
        }
        if(num==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
    }
}
