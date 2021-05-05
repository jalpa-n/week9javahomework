package Javaprogramms9;

import java.util.*;

//3. Write a Java program to reverse an array of integer values.


public class P_3Reversearray {

    //Static Method

    public static void reverse() {

        Scanner array = new Scanner(System.in);
        System.out.print("Enter the value for length of array: \t");
        int length = array.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value of index " + i + " for array");
            System.out.println(arr[i] = array.nextInt());
        }
        System.out.println("Original Array : \t" + Arrays.toString(arr));

        int i = 0;
        int arr1[] = new int[length];
        for (int j = arr.length - 1; j >= 0; j--) {
            arr1[j] = arr[i];
            i++;
        }

        System.out.println("Reverse Array : \t" + Arrays.toString(arr1));

    }

    //Static method
    public static void reverseArrayList() {

        List<Integer> list = new ArrayList<Integer>();

    }

    //Main method
    public static void main(String[] args) {
        reverse();//Call reverse method in main method
        reverseArrayList(); //Call reverseArraylist method

    }

}


