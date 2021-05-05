package Javaprogramms9;

import java.util.Map;

public class P9_Hasmap {
    /*
    9. Create a HashMap object called people that will store String keys and Integer
    values: And use for each loop to iterate the value from Map.
     */

    //Instance method
    public void hashMap() {

        Map<String, Integer> people = new java.util.HashMap<String, Integer>();

        people.put("emily", 10);
        people.put("jason", 25);
        people.put("katty", 100);
        people.put("deon", 47);
        people.put("Alexzander", 10);


        for (String i : people.keySet()) {

            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }

    //Main method
    public static void main(String[] args) {

        P9_Hasmap map = new P9_Hasmap();  //create object
        map.hashMap(); //call hashMap method via map object
    }
}