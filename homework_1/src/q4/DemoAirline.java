package q4;

public class DemoAirline {

	public static void main(String[] args) {
		SeatAssignment sa1 = new SeatAssignment(12, 'F');
		AirlineTickets at1 = new AirlineTickets("surat","ahmedabad","aa123",sa1);
		
		System.out.println(at1);
		
		SeatAssignment sa2 = new SeatAssignment(27, 'M');
		AirlineTickets at2 = new AirlineTickets("ahmedabad","bombay","sm786",sa2);
		
		System.out.println(at2);
	}

}
