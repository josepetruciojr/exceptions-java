package application;

import model.entities.Reservation;
import model.exception.DomainExeception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Room Number: ");
            int number = sc.nextInt();
            System.out.println("Check-in Date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out Date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in Date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out Date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation update: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date entered.");
        }
        catch (DomainExeception e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error.");
        }
     }
}
