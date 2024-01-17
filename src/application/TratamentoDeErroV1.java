package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExeception;

public class TratamentoDeErroV1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number:");
			int number = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
					
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
					
			Reservation rs = new Reservation(number, checkIn, checkOut);
			System.out.println(rs.toString());
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			rs.updateDates(checkIn, checkOut);
			System.out.println(rs.toString());
			
		} catch (ParseException pe) {
			System.out.println("Data inválida! ");
		} catch (DomainExeception e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		sc.close();
	}
}
