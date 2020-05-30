package labs_examples.conditions_loops.labs;

import java.util.ArrayList;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */


public class Exercise_10 {
    public static void main(String[] args){

        for(int i = 1; i < 10; i ++) {
            if(i % 3 == 0){
                continue;
            }

            System.out.print(i);

        }
        ArrayList<Integer> dayOfWeek = new ArrayList<Integer>();
        dayOfWeek.add(1);
        dayOfWeek.add(2);
        dayOfWeek.add(3);
        dayOfWeek.add(4);

        // please use a For Each Loop to print each element
//        for(int b: dayOfWeek){
//            System.out.println(b);
//        }
        int[][] num = new int[4][5];

        for(int a = 0; a < num.length; a++){
            for(int b = 0; b < num[a].length; b ++){
                num[a][b] = a * b;
                System.out.print(num[a][b] + " |");
            }
            System.out.println();

        }
    }


}
