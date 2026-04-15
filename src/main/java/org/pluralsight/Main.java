package org.pluralsight;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static void main() {
        // gets user input
        CellPhoneApplication theCellPhoneApplication = getCellPhoneApplicationDetails();

        // displays user output
        displayCellPhoneApplicationConfirmation(theCellPhoneApplication);
    }


    static CellPhoneApplication getCellPhoneApplicationDetails() {
        // calls the cell phone app java class
        CellPhoneApplication theCellPhoneApplication = new CellPhoneApplication();

        // app name printed on start up
        System.out.println("Cell Phone Application");
        System.out.println("-----------------------------------------------");


        // asks for user's name
        System.out.print("What is your name?: ");
        String name = input.nextLine();
        theCellPhoneApplication.setName(name);


        // asks for user phone info
        System.out.print("What is the make/model of this phone?: ");
        String model = input.nextLine();
        theCellPhoneApplication.setModel(model);

        System.out.print("Who is the phone carrier?: ");
        String carrier = input.nextLine();
        theCellPhoneApplication.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String number = input.nextLine();
        theCellPhoneApplication.setPhoneNumber(number);

        System.out.print("What is the phone's serial number?: ");
        int serialNumber = input.nextInt();
        theCellPhoneApplication.setSerialNumber(serialNumber);

        // troll
        System.out.print("What is your credit card number and social security number?: ");
        String trollNumbers = input.nextLine();

        // line is here so the app doesn't break
        return theCellPhoneApplication;

    }

    // outputs all info the user input
    static void displayCellPhoneApplicationConfirmation(CellPhoneApplication theCellPhoneApplication) {


        System.out.println(theCellPhoneApplication.getName());
        System.out.println("Your phone's model/make is: " + theCellPhoneApplication.getModel());
        System.out.println("Your phone carrier is: " + theCellPhoneApplication.getCarrier());
        System.out.println("Your phone number is: " + theCellPhoneApplication.getPhoneNumber());
        System.out.println("Your serial number is: " + theCellPhoneApplication.getSerialNumber());

    }
}
