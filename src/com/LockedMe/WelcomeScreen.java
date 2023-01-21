package com.LockedMe;

import java.util.Scanner;

public class WelcomeScreen {

    public static void displayMenu(){
        System.out.println();
        System.out.println("You can choose from these options By enter the option Number");
        System.out.println("1-  Display ALl the Current File Names in Asc order");
        System.out.println("2 - Redirect to the CURD operations");
        System.out.println("3 - Close the Application");

    }
    public static void main(String[] args) {

        System.out.println("Welcome to the LockedMe.com Application");
        System.out.println("Developer Details :"+'\t' + "Mohamed Ishak"+'\t'+"Software Test Engineer at _VOIS Company");

        Scanner input = new Scanner(System.in);

        while (true){
            displayMenu();
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("First Option : ");
                    break;
                case 2:
                    System.out.println("Second Option :");
                    break;
                case 3:
                    System.out.println("Third Option : ");
                    break;
                default:

            }

        }

    }
}
