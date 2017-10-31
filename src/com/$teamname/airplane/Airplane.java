package com.$teamname.airplane;

public class Airplane {
	
//	<Airplane Manufacturer="Airbus" Model="A310">
//	<FirstClassSeats>24</FirstClassSeats>
//	<CoachSeats>200</CoachSeats>
//</Airplane>
	
	/**
	 * Airplane attributes as defined by the CS509 server interface XML
	 */
	private String manufacturer;
	private String model;
	private int firstClassSeats;
	private int coachSeats;
	
	
	Airplane(String manufacturer, String model, int firstClassSeats, int coachSeats) {
		
		this.manufacturer = manufacturer;
		this.model = model;
		this.firstClassSeats = firstClassSeats;
		this.coachSeats = coachSeats;
	}
	
	
	public String getManufacturer() {
		return manufacturer;
	}



	public String getModel() {
		return model;
	}



	public int getFirstClassSeats() {
		return firstClassSeats;
	}



	public int getCoachSeats() {
		return coachSeats;
	}



	

	
	

}
