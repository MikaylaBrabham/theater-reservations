package com.pluralsight;
//import date
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import scanner
import java.util.Scanner;

//import date formatter


public class TheaterReservations {

    public static void main(String[] args) {
        //named scanner
        Scanner scanner = new Scanner(System.in);

        //prompt for users name
        System.out.println("Please enter your name: ");
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


    }
}
