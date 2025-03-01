package Rctech;

import java.util.Collection;

public interface Ticketservice {
	
	public Ticket bookTicket(Passenger p);
	
	public Collection<Ticket> getAllTickets();

}
