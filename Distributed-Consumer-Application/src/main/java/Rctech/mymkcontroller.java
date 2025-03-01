package Rctech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;
import reactor.core.publisher.Mono;

@Controller
public class mymkcontroller {

	@Autowired
	private Mymkservice service;
	@PostMapping("/ticket")
	public String ticketBooking(@ModelAttribute("p") Passenger p, Model model) {
		Mono<Ticket> bookTicket = service.bookTicket(p);
		Ticket ticket = bookTicket.block();
		return "bookTicket";
	}
}
