package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//constructors
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	//getters and setters

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	//methods
	//long - inteiro mais longo
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		//convert the diff variable (milli seconds unit) do days.
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout; 
		
	}
	@Override
	public String toString () {
		return "Room "
				+ roomNumber
				+ ", Check-in: "
				+ sdf.format(checkin)
				+ ", Check-out: "
				+ sdf.format(checkout)
				+ ", "
				+ duration()
				+ " nights";
	}
	
	
	

}