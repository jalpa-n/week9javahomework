package Javaprogramms9;
/*

6. Write a Java program to retrieve an element (at a specified index) from a given
array list*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P6_RetriveArray {
    public void retrive() {

        // Creae a list and add some colors to the list

        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("BMW");
        list_Strings.add("Bently");
        list_Strings.add("Lexus");
        list_Strings.add("Rolls-Royes");
        list_Strings.add("Vauxhall");

        // Print the list
        System.out.println(list_Strings);

        // Retrive the first and third element
        String element = list_Strings.get(0);
        System.out.println("First element: " + element);
        element = list_Strings.get(2);
        System.out.println("Third element: " + element);
    }


    public static void main(String[] args) {

        P6_RetriveArray retr = new P6_RetriveArray();
        retr.retrive();
    }
}