package Javaprogramms9;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;

public class p1_Calculator {

    //Instance methods
    public void addition(int a, int b) {
        System.out.println("Addition of first and second number is : " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of first and second number is : " + (a - b));
    }

    public void division(int a, int b) {
        System.out.println("Division of first and second is : " + (a / b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of first and second is : " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else {
            System.out.println("Invalid Symbol");
        }

    }

}


