package HoWo2;

import java.util.Scanner;

public class Task_5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter string: ->");
            String str = scanner.nextLine();

            if (isPalindrome(str)) {
                System.out.println("The entered string is a palindrome.");
            } else {
                System.out.println("The entered string is not a palindrome.");
            }
        }

        public static boolean isPalindrome(String str) {
            str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
