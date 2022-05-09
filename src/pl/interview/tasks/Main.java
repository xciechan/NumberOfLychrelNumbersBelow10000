package pl.interview.tasks;

import java.math.BigInteger;

public class Main {

    /**
     Created by xciechan
     on 2022-05-09

     The application return number of Lychrel numbers below ten-thousand.
     Lychrel number - is number that never forms a palindrome through the reverse and add process.
     */

    public static void main(String[] args) {
        int rangeOfSearch = 10000;

        System.out.println(checkingPalindromicNumber(1221)); //test

    }

    public static boolean checkingPalindromicNumber (int number){
        String checkingNumber = String.valueOf(number);
        String reverseCheckingNumber = "";

        for(int i = checkingNumber.length()-1; i>=0; i--) {
            reverseCheckingNumber = reverseCheckingNumber + checkingNumber.charAt(i);
        }

        if (reverseCheckingNumber.equals(checkingNumber))
            return true;
        else
            return false;
    }

}
