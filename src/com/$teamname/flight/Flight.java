package com.$teamname.flight;

import com.$teamname.airport.*;
import com.$teamname.time.Time;

import com.$teamname.airplane.Airplane;

public class Flight {
	
	
//	// 
//	<Flight Airplane="747" FlightTime="217" Number="1560">
//	<Departure>
//		<Code>AUS</Code>
//		<Time>2016 May 10 02:47 GMT</Time>
//	</Departure>
//	<Arrival>
//		<Code>BOS</Code>
//		<Time>2016 May 10 06:24 GMT</Time>
//	</Arrival>
//	<Seating>
//		<FirstClass Price="$132.54">27</FirstClass>
//		<Coach Price="$41.09">206</Coach>
//	</Seating>
//		</Flight>

	private Airport departAirport;
	private Airport arrivalAirport;
	private Time departTime;
	private Time arrivalTime;
	private Airplane airplane;
	private int flightTime;
	private int number;
	
	
	
	
	Flight(Airplane airplane, Airport departAirport, Airport arrivalAirport) {
		
		this.airplane = airplane;
		this.departAirport = departAirport;
		this.arrivalAirport = arrivalAirport;
		
		
	}
	

}
