package q4;

public class AirlineTickets {
	private String fromcity;
	private String tocity;
	private String fnumber;
	private SeatAssignment sa;
	public AirlineTickets(String fromcity, String tocity, String fnumber, SeatAssignment sa) {
		this.fromcity = fromcity;
		this.tocity = tocity;
		this.fnumber = fnumber;
		this.sa = sa;
	}
	public String getFromcity() {
		return fromcity;
	}
	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}
	public String getTocity() {
		return tocity;
	}
	public void setTocity(String tocity) {
		this.tocity = tocity;
	}
	public String getFnumber() {
		return fnumber;
	}
	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
	public SeatAssignment getSa() {
		return sa;
	}
	public void setSa(SeatAssignment sa) {
		this.sa = sa;
	}
	@Override
	public String toString() {
		return "AirlineTickets [fromcity=" + fromcity + ", tocity=" + tocity + ", fnumber=" + fnumber + "," + sa + "]";
	}
}

class SeatAssignment {
	private int row;
	private char seat;
	public SeatAssignment(int row, char seat) {
		this.row = row;
		this.seat = seat;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public char getSeat() {
		return seat;
	}
	public void setSeat(char seat) {
		this.seat = seat;
	}
	
	@Override
	public String toString() {
		return "SeatAssignment [row=" + row + ", seat=" + seat + "]";
	}
	
	
}