package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please pick a number between 1 - 10");

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int num = scanner.nextInt();

        if(1 <= num & num <= 10){
            System.out.println("the  number at index " + num + " is " + array[num - 1]);
        }





    }
}