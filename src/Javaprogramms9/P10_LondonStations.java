package JavapProgramms9;

import java.util.HashMap;
import java.util.Scanner;

public class P10_LondonStations {

    public void tubestation() {
        String train;
        char ch;
        do {
            Scanner map = new Scanner(System.in);
            System.out.println("List of all Underground Stations:");
            System.out.println("baker street,knightsbridge,picadilly,bayswater,nottinghillgate,south kensington");
            System.out.println("high street kensington,earlscourt,earlscourt,gloucester road,waterloo");

            System.out.print("pleas enter the Station name from the list: ");
            train = map.nextLine();

            if (train.equals("picadilly")) {
                System.out.println("\nBakerloo line\n Circle line \n District line \n Hammersmith &city line");
            } else if (train.equals("bayswater")) {
                System.out.println("Circle line \n District line");
            } else if (train.equals("nottinghillgate")) {
                System.out.println("\n Central line \n Circle line \n District line");
            } else if (train.equals("high street kensington")) {
                System.out.println("\n Circle line \n District line");
            } else if (train.equals("earlscourt")) {
                System.out.println("\n District line \n Picadilly line");
            } else if (train.equals("gloucester road")) {
                System.out.println("\n Circle line \n District line \n Picadilly line");
            } else if (train.equals("south kensington")) {
                System.out.println("\n Circle line \n District line \n Picadilly line");
            } else if (train.equals("knightsbridge")) {
                System.out.println("\n Picadilly line");
            } else if (train.equals("baker street")) {
                System.out.println("\n Bakerloo line \n circle line \n Hammersmith & city line \n Jubilee line \n Metropolitan line");
            } else
                System.out.println(" ");

            System.out.println("do you want information for any more stations :");
            ch = map.next().charAt(0);

        }while (ch=='y'|| ch=='Y');

    }

    public static void main(String[] args) {
        P10_LondonStations obj = new P10_LondonStations();
        obj.tubestation();
    }
}
