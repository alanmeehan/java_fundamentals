package labs_examples.conditions_loops;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){


        boolean x = true;

       // if (x == (y | z)){

       // }

        ArrayList<String> guests = new ArrayList<String>();

        guests.add("Arnold");
        guests.add("Gerald");
        guests.add("Eugene");
        guests.add("Helga");
        guests.add("Phoebe");

        for(String names: guests){
            System.out.println(names);
        }

        guests.remove(2);

        for(String names: guests){
            System.out.println(names);
        }

    }
}
