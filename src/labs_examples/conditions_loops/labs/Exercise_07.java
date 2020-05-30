package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word");
    String word = scanner.nextLine();
    System.out.print(word);

    //String word = "aeiou";
    boolean x = true;

        while(x){
//            take in a word
//            check if the word has a vowel?
//                    method to check if a vowel is found
//                    return vowel/ ask for another word

        }
    char result = word.charAt(3);
    int length = word.length();
    int position = word.indexOf('i');

        System.out.println("character position "+result );
        System.out.println("length of word"+length);
        System.out.println("letter at "+position);
    }
}
