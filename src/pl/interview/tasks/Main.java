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
        int numberOfLychrelNumbers = 0;

        for(int i = 0; i<rangeOfSearch; i++) {
            if (checkingPalindromicNumber(i))
                numberOfLychrelNumbers += 1;
        }
        System.out.println("Number of Lychrel Numbers below 10000: " + numberOfLychrelNumbers);

    }

    public static boolean checkingPalindromicNumber (int number){
        int countIteration = 10;
        String firstNumber = String.valueOf(number);
        String reverseNumber = "";
        String checkingNumber = "";

        for (int i=1; i<=countIteration; i++){
            reverseNumber = reverseNumber(firstNumber);
            checkingNumber = String.valueOf( Integer.valueOf(firstNumber) + Integer.valueOf(reverseNumber) );

//            System.out.println(firstNumber);
//            System.out.println(reverseNumber);
//            System.out.println(checkingNumber);
//            System.out.println();

            if (reverseNumber(checkingNumber).equals(checkingNumber)) {
//                System.out.println("Number: " + number + "   Count interations: " + i + "   Palindromic number: " + checkingNumber);
                return false;
            } else if (i == countIteration){
                System.out.println("Lychrel number: " + number + "   (Performed iterations: " + i + ")");
            }

            firstNumber = checkingNumber;

        }

        return true;
    }

    public static String reverseNumber(String number){
        String reverseNumber = "";

        for(int i = number.length()-1; i>=0; i--) {
            reverseNumber = reverseNumber + number.charAt(i);
        }

        return  reverseNumber;
    }

}
