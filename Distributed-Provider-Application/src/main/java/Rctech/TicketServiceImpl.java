package Rctech;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements Ticketservice{
	
	Map<Integer, Ticket> dp = new HashMap<Integer, Ticket>();

	@Override
	public Ticket bookTicket(Passenger p) {
		Ticket ticket = new Ticket();
		Random random = new Random();
		int id = random.nextInt(10);
		ticket.setTicketNumber(id);
		BeanUtils.copyProperties(p, ticket);
		ticket.setTicketStatus("Ticket is booked");
		dp.put(id, ticket);
		return ticket;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		return dp.values();
	}

}
