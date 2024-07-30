package ticket_booking; 

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Default Constructor
    public TicketBooking() {
        this.stageEvent = "";
        this.customer = "";
        this.noOfSeats = 0;
    }

    // Parameterized Constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Payment using cash
    public void makePayment(double amount) {
        System.out.printf("Receipt:\nStage Event: %s\nCustomer: %s\nNumber of Seats: %d\nPayment Method: Cash\nAmount: $%.1f\n",
                this.stageEvent, this.customer, this.noOfSeats, amount);
    }

    // Payment using online wallet
    public void makePayment(String walletNumber, double amount) {
        System.out.printf("Receipt:\nStage Event: %s\nCustomer: %s\nNumber of Seats: %d\nPayment Method: Online Wallet\nWallet Number: %s\nAmount: $%.1f\n",
                this.stageEvent, this.customer, this.noOfSeats, walletNumber, amount);
    }

    // Payment using credit card
    public void makePayment(long creditCardNumber, double amount) {
        System.out.printf("Receipt:\nStage Event: %s\nCustomer: %s\nNumber of Seats: %d\nPayment Method: Credit Card\nCredit Card Number: %d\nAmount: $%.1f\n",
                this.stageEvent, this.customer, this.noOfSeats, creditCardNumber, amount);
    }
}
