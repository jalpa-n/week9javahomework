package Javaprogramms9;

public class P23_week8 {
    /* 23. Example of method overriding
    //Java Program to illustrate the use of Java Method Overriding
    //Creating a parent class.*/
    //defining a method

    public void run()
    {System.out.println("Vehicle is running");}
}

//Creating a child class
class Bike2 extends P23_week8 {

    //defining the same method as in the parent class

    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }

}