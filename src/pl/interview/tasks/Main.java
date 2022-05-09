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
        System.out.println("Number of Lychrel Numbers below 10000: " + numberOfLychrelNumber(rangeOfSearch));

    }

    public static int numberOfLychrelNumber(int rangeOfSearch){
        int numberOfLychrelNumbers = 0;

        for(int i = 0; i<rangeOfSearch; i++) {
            if (checkingPalindromicNumber(i))
                numberOfLychrelNumbers += 1;
        }

        return numberOfLychrelNumbers;
    }

    public static boolean checkingPalindromicNumber (int number){
        int countIteration = 50;
        String firstNumber = String.valueOf(number);
        String reverseNumber = "";
        String checkingNumber = "";

        BigInteger bigIntegerFirst;
        BigInteger bigIntegerReverse;

        for (int i=1; i<=countIteration; i++){
            reverseNumber = reverseNumber(firstNumber);

            bigIntegerFirst = new BigInteger(firstNumber);
            bigIntegerReverse = new BigInteger(reverseNumber);
            checkingNumber = (bigIntegerFirst.add(bigIntegerReverse)).toString();

            if (reverseNumber(checkingNumber).equals(checkingNumber)) {
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
