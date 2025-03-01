package Rctech;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {
	
	@Autowired
	private Ticketservice service;
	
	@PostMapping("/ticket")
	public Ticket booTicket(Passenger p) {
		Ticket ticket = service.bookTicket(p);
		return ticket;
	}
	
	@GetMapping("/ticket")
	public Collection<Ticket> getTickets(){
		Collection<Ticket> allTickets = service.getAllTickets();
		return allTickets;
	}

}
