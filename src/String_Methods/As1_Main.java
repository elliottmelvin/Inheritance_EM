package String_Methods;

import Utilities.Library;

import java.util.Scanner;
import java.util.ArrayList;

public class As1_Main {

    public static Scanner input = new Scanner( System.in );

    public static void run() {
        System.out.println("Assign 1 Network Messages");

        ArrayList<As1_Message> allMessages = new ArrayList<As1_Message>();
        allMessages.add(new As1_Message("Server1: file not found"));



        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = input.nextInt();
            input.nextLine();
            System.out.println();

            if (option == 1) {
                System.out.println("What message would you like to add?");
                String answer = Library.input.nextLine();
                allMessages.add(new As1_Message(answer));
            } else if (option == 2) {
                System.out.println("Security Message\tMachine ID \tMachine Type ");
                for (As1_Message message : allMessages){
                    message.printMe();
                }
            } else if (option == 3) {
                System.out.println("What error should we look for?");
                String searchError = Library.input.nextLine();

                for (As1_Message message : allMessages){
                    if(message.scanWarning(searchError)){
                        message.printMe();
                    }
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("That is not an available option");
            }
            System.out.println("Logging out. Good Bye.");        }//while

    }//main


}//class
