package HoWo1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year -> :");
        int year = in.nextInt();
        if (((year%4==0)&&(year%100!=0))||(year%400==0)) {
                System.out.println("This  " + year + "  is a leap year");
            }
            else {
                System.out.println("This  " + year + "  is not a leap year");
            }
        }
    }
