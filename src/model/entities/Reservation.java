package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainExeception;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExeception {
		if(!checkOut.after(checkIn)) {
			throw new DomainExeception("Erro! A data de check-out deve estar depois da data de check-in");
		} 
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainExeception{
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainExeception("Devem ser datas futuras!");
		}
		if(!checkOut.after(checkIn)) {
			throw new DomainExeception("Erro! A data de check-out deve estar depois da data de check-in");
		} 
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	
	@Override
	public String toString() {
		return "Reservation: Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", nights: " + duration();
	}
}
