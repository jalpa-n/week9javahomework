package Javaprogramms9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P_5Arrayiterator {
    //Instance method
    public void iteratorArray(){

        List<Integer> list=new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(70);
        list.add(40);
        list.add(60);
        list.add(100);
        list.add(90);
        list.add(80);
        list.add(50);

        Iterator itr=list.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        System.out.println("ArrayList : "+ list);
    }

    //Main method
    public static void main(String[] args) {
P_5Arrayiterator array =new P_5Arrayiterator();
array.iteratorArray();
    }
}

