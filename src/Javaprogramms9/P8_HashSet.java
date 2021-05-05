package Javaprogramms9;

import java.util.HashSet;
import java.util.Set;

public class P8_HashSet {
     /*
    8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
    Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
    and if else)
     */

    //Instance method
    public void hashSet() {

        Set<Integer> num = new java.util.HashSet<>();

        num.add(3);
        num.add(11);
        num.add(6);

        System.out.println(num);

        for (int i = 1; i <= 10; i++) {

            if (num.contains(i)) {

                System.out.println("\n\t" + i + "\t is found in set");

            }

        }

    }

    //Main method
    public static void main(String[] args) {

        P8_HashSet set=new P8_HashSet();  //create object
        set.hashSet();  //call hashmap method via map object

    }

}

