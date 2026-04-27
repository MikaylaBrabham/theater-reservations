package com.pluralsight;
//import scanner
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//import date formatter
DateTimeFormatter formatter;

public class TheaterReservations {

    public static void main(String[] args) {
        //named scanner
        Scanner scanner = new Scanner(System.in);

        //prompt for users name
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();

        //prompt for users show date
        System.out.printf("What date will you be coming (MM/dd/yyyy): ");
        Double showDate = scanner.nextDouble();

        //prompt for users amount tickets
        System.out.printf("How many tickets would you like? ");
        Double txAmount = scanner.nextDouble();

    }
}
