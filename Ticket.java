class Ticket
{
	private final String passengerName;
	private final int ticketNo;
	private static int counter = 501;
	
	Ticket(String passengerName)
	{
		this.passengerName = passengerName;
		this.ticketNo = counter++;
	}
	
	void displayTicket()
	{
		System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
	}
	
	public static void main(String[] args)
	{
		Ticket ticket = new Ticket("manat");
		ticket.displayTicket();
	}
}
