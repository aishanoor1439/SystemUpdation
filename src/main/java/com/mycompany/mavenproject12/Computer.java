package com.mycompany.mavenproject12;

import java.util.Scanner;

//Class Definition
public class Computer {

    Scanner input = new Scanner(System.in);

//  Attributes
    private String name;
    private String processor;
    private String ram;
    private String deviceID;
    private String systemType;

//  Methods
    public void setAttributes() {
        System.out.print("Please enter the device name:");
        name = input.nextLine();
        System.out.print("Enter the processor details (e.g., Intel i7, AMD Ryzen 5):");
        processor = input.nextLine();
        System.out.print("Specify the RAM size and type (e.g., 16GB DDR4):");
        ram = input.nextLine();
        System.out.print("Provide the unique Device ID:");
        deviceID = input.nextLine();
        System.out.print("Enter the system type (e.g., 64-bit, 32-bit):");
        systemType = input.nextLine();
        showConfig();
    }

    public void showConfig() {
        System.out.println("Device name:" + name);
        System.out.println("Processor:" + processor);
        System.out.println("Installed RAM:" + ram);
        System.out.println("Device ID:" + deviceID);
        System.out.println("System type:" + systemType);
        System.out.println("Do you want to update your system?");
        char response = input.next().charAt(0);
        if (response == 'y') {
            updateSystem();
        } else {
            System.out.println("Thank you for using the program!");
        }
    }

    public void updateSystem() {
        System.out.println("What do you want to update?");
        char response = input.next().charAt(0);
        input.nextLine();
        switch (response) {
            case 'n':
                System.out.println("Enter the updated value:");
                name = input.nextLine();
                break;
            case 'p':
                System.out.println("Enter the updated value:");
                processor = input.nextLine();
                break;
            case 'r':
                System.out.println("Enter the updated value:");
                ram = input.nextLine();
                break;
            case 'd':
                System.out.println("Enter the updated value:");
                deviceID = input.nextLine();
                break;
            case 's':
                System.out.println("Enter the updated value:");
                systemType = input.nextLine();
                break;
            default:
                System.out.println("Invalid input!");
        }
        showConfig();
    }
}
