package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args){

        for(int i = 1; i < 10; i ++) {
            if(i % 3 == 0){
                System.out.println(i);
                break;
            }
        }
        int x = 10;
        if(x > 10){
            System.out.println("balls to the wall");
        }else if(x < 10){
            System.out.println("malls to the wall");
        }else{
            System.out.println("malls is balls");
        }
    }
}
