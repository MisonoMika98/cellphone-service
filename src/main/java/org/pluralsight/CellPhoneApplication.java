package org.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication
{

    static Scanner input = new Scanner(System.in);


    static void main()
    {
        // might be redundant? (test later)
        CellPhone theCellPhone = getCellPhoneApplicationDetails();

        // creates a 2nd theCellPhone object using a function
        CellPhone theCellPhone2 = getCellPhoneApplicationDetails();

        // displays user output
        displayCellPhoneApplicationConfirmation(theCellPhone);

        // phones calling each other, using methods from the CellPhone class
        theCellPhone.dialNumber(theCellPhone2.getPhoneNumber());
        theCellPhone2.dialNumber(theCellPhone.getPhoneNumber());
    }


    static CellPhone getCellPhoneApplicationDetails()
    {
        // calls CellPhone class to create a new theCellPhone (variable name) object
        CellPhone theCellPhone = new CellPhone();

        // app name printed on start up
        System.out.println("Cell Phone Application");
        System.out.println("-----------------------------------------------");


        // asks for user's name
        System.out.print("What is your name?: ");
        String name = input.nextLine().trim();
        theCellPhone.setName(name);


        // asks for user phone info
        System.out.print("What is the make/model of this phone?: ");
        String model = input.nextLine().trim();
        theCellPhone.setModel(model);

        System.out.print("Who is the phone carrier?: ");
        String carrier = input.nextLine().trim();
        theCellPhone.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String number = input.nextLine().trim();
        theCellPhone.setPhoneNumber(number);

        System.out.print("What is the phone's serial number?: ");
        int serialNumber = input.nextInt();
        // clears user input
        input.nextLine();
        theCellPhone.setSerialNumber(serialNumber);


        // line is here so the app doesn't break
        return theCellPhone;

    }

    // outputs all info the user input
    static void displayCellPhoneApplicationConfirmation(CellPhone theCellPhone)
    {

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println(theCellPhone.getName());
        System.out.println("Your phone's model/make is: " + theCellPhone.getModel());
        System.out.println("Your phone carrier is: " + theCellPhone.getCarrier());
        System.out.println("Your phone number is: " + theCellPhone.getPhoneNumber());
        System.out.println("Your serial number is: " + theCellPhone.getSerialNumber());
        System.out.println("-------------------------------------------");
        System.out.println();

    }
}
