package java_week_3_program;
import java.util.Scanner;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program_6_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Program_6_OddEven oddEven = new Program_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number ) + "number");
        scanner.close();
    }
    public String isItEvenOrOddNumber (int number ){
        if (number % 2 == 0 ) {
            return "Even ";
        }else {
            return "Odd";
        }
    }

}
