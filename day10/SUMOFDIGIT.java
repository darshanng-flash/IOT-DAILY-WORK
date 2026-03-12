//SUM OF DIGITS USING RECURSION 
package day10;

public class SUMOFDIGIT {
    public static void main(String[] args) {
        int number = 123;
        int sum = sumOfDigits(number);
        System.out.println("The sum of digits in " + number + " is: " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; 
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}
