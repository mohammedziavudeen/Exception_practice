package javaLoop;

import java.util.Scanner;

public class AscendingOrderCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();   
        if(isAscending(num)) {
            System.out.println("Success");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isAscending(int num) {
        int prevDigit = 9; // initialize to highest possible digit
        while(num > 0) {
            int currDigit = num % 10;
            if(currDigit >= prevDigit) {
                prevDigit = currDigit;
                num /= 10;
            } else {
                return false;
            }
        }
        return true;
    }
}
