package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<Integer> Alan = new ArrayList<Integer>();

        Alan.add(1);
        Alan.add(2);
        Alan.add(3);
        Alan.add(4);
        Alan.remove(3);
        int y = Alan.indexOf(1);
        int z = Alan.size();
        boolean x = Alan.isEmpty();
        int t = Alan.lastIndexOf(Alan);

        System.out.println(y);
        System.out.println(z);
        System.out.println(x);
        System.out.println(t);

    }
}
