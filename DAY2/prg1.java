package day2;

public class prg1 {
    public static void main(String[] args) {
        int num=153;
        int count=0;
        double sum=0;
        int temp=num;
        while (temp>0){
            count++;
            temp=temp/10;

        }
        temp=num;
        while (temp>0){
            int digit=temp%10;
            sum=sum+Math.pow(digit,count);
            temp=temp/10;
        }
        if(num==sum)
        System.out.println("Armstrong");
    }
}
