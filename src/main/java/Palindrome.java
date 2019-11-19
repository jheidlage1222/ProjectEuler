import java.lang.*;
import java.util.*;

public class Palindrome {

    public void findLargestPalindrome() {
        //int numCheck = 21412;
        //System.out.println("###Is '" + numCheck + "' a Palindrome? " + this.isPalindrome(numCheck));
        System.out.println("####Starting check#####");
        System.out.println("###Value is: " + this.findLargestPalindromeNew());
        System.out.println("####Op Complete#####");
    }

    public boolean isPalindrome(Integer numToCheck) {
        boolean retVal = false;
        String numStringVal = numToCheck.toString();
        String newStringVal = "";
        for (int i = numStringVal.length() - 1; i > -1; i--) {
            newStringVal += String.valueOf(numStringVal.charAt(i));
        }
        if (numStringVal.compareTo(newStringVal) == 0) {
            return true;
        } else return false;
        //return retVal;
    }

    public int findLargestPalindromeNew() {
        int max = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                if(isPalindrome( i * j)){
                    System.out.println("Found I J: " + i + " " + j);
                    System.out.println("Sum: " + (i * j));
                    //return i * j;
                    if(i * j > max){

                        max = i * j;
                        System.out.println("####FOUND NEW MAX: ");
                    }
                }
            }
        }
        return max;
    }
}
