/***
 * A class for manipulating strings so that they are properly capitalized.
 *
 * @author Abigail Marsh, Fall 2019
 */

package activityStarterCode.stringPractice;

import java.util.Scanner;

public class UppercaseFirstLetter {

    /***
     * A method for converting the first letter of a string to uppercase.
     * Implement this method
     *
     * @param input A string to be modified
     * @return The input string, but with the first letter now capitalized
     */
    public static String uppercaseFirstLetter(String input) {
        if (input.length() != 0) {
            String input1 = input.substring(0, 1);
            String inputend = input.substring(1);
            input1 = input1.toUpperCase();
            input = input1 + inputend;
            return input;
        }
        else
            return "";

    }

    /***
     * Run this program to test your method on different input strings
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something you would like to modify: ");

        String input = scan.nextLine();

        System.out.println(uppercaseFirstLetter(input));
    }
}
