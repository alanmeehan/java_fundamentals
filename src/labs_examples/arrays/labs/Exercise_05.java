package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        ArrayList<Double> choose = new ArrayList<Double>();

        choose.add(1.2);
        choose.add(2.3);
        choose.add(12.3);
        choose.add(6.5);
        choose.add(9.8);
        choose.add(5.5);


        System.out.println();
        for (int i = choose.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(choose.get(i));

            }

        }

    }
}