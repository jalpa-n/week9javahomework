package Javaprogramms9;

/*
4. Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.
 */

import java.util.ArrayList;
import java.util.List;

public class P_4ColorsArray {

    //Inastance Method
    public void colorsArray()
    {
        List<String> list = new ArrayList<String>();

        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        list.add("Black");
        list.add("Brown");
        list.add("Pink");
        list.add("Purple");
    for(String s : list){

        System.out.println(s);

    }
        System.out.println("Arraylist of different colors :" +list);
    }
    //Main method
    public static void main(String[] args) {
        //create object
        P_4ColorsArray clor = new P_4ColorsArray();
       //call instance method into main method by object.
        clor.colorsArray();
    }

}
