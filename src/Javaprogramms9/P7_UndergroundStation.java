package Javaprogramms9;

import java.util.ArrayList;
import java.util.List;
/*
7. Write a Java program to test an array list is empty or not. Define array list with
        underground tube names
*/
public class P7_UndergroundStation {


    public void underGroundTube() {

        List<String> undergroundlist= new ArrayList<String>();

        undergroundlist.add("Bakerloo");
        undergroundlist.add("Central");
        undergroundlist.add("Circle");
        undergroundlist.add("District");
        undergroundlist.add("Hammersmith");
        undergroundlist.add("Piccadilly");
        undergroundlist.add("Victoria");
        undergroundlist.add("Northern");
        undergroundlist.add("Waterloo & city");


        System.out.println("\nArrayList :" + undergroundlist);

        if (undergroundlist.isEmpty()) {
            System.out.println("\nArrayList is empty");
        } else {
            System.out.println("\nArrayList is not empty");
        }
    }

    //Main method
    public static void main(String[] args) {

        P7_UndergroundStation empty = new P7_UndergroundStation();  //Create object
        empty.underGroundTube(); //call underGroundTube method via empty object

    }
}