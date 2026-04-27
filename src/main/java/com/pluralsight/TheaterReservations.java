package com.pluralsight;
//import date
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import scanner
import java.util.Scanner;


public class TheaterReservations {

    public static void main(String[] args) {
        //named scanner
        Scanner scanner = new Scanner(System.in);

        //prompt for users name
        System.out.printf("Please enter your name: ");
        String fullName = scanner.nextLine();

        //prompt for users show date
        System.out.printf("What date will you be coming (MM/dd/yyyy): ");
        String showDate = scanner.nextLine();

        //format date the user gives
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate formattedShowDate = LocalDate.parse(showDate, formatter);

        //prompt for users amount tickets
        System.out.printf("How many tickets would you like? ");
        Integer txAmount = scanner.nextInt();

        //display confirmation  message if over 1 ticket amount
        if(txAmount > 1) {
            String confirmationMessage;
            System.out.printf("%d tickets reserved for %s under %s"
                    , txAmount, formattedShowDate, fullName);
        }
        //display confirmation message if only 1 ticket
        if(txAmount == 1) {
            String  confirmationMessageTwo;
            System.out.printf("%d ticket reserved for %s under %s"
                    , txAmount, formattedShowDate, fullName);
        }


    }
}
