package labs_examples.arrays.labs;

import static java.lang.Math.*;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] dates = new int[3][];
        dates[0] = new int[3];
        dates[1] = new int[1];
        dates[2] = new int[5];


        //int x = (int)(Math.random());

        //int[][] eggs = new int[4][5];
        for(int i = 0; i < dates.length; i++){
            for(int j = 0; j < dates[i].length; j++){
                //int x = random.nextInt();
                //System.out.print(x + "x|" );
                dates[i][j] = (i+1) * j ;
                System.out.print(dates[i][j]);
            }
            System.out.println();

        }


    }

}
