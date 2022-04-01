package java_week_3_program;

import java.util.Scanner;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program_2_LeapYear {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner Scanner = new Scanner(System.in);
        System.out.println("please enter the year: ");
        int year = Scanner.nextInt();
        Program_2_LeapYear leapYear = new Program_2_LeapYear();
        leapYear.isItLeapYear(year);
        //closing the scnner object
        Scanner.close();

    }

    //checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year");
    }

}

