package Rctech;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class Mymkservice {

	public Mono<Ticket> bookTicket(Passenger p){
		String apiurl = "http://52.66.250.143:8080/ticket";
		WebClient webClient = WebClient.create();
		
		Mono<Ticket> bodyToMono = webClient.post()
											.uri(apiurl)
											.body(BodyInserters.fromValue(p))
											.retrieve()
											.bodyToMono(Ticket.class);
		
		return bodyToMono;
	}
	
	
	public Mono<Ticket> getAllTickets(){
		String apiurl = "http://52.66.250.143:8080/ticket";
		WebClient webClient = WebClient.create();
		Mono<Ticket> bodyToMono = webClient.get()
											.uri(apiurl)
											.retrieve()
											.bodyToMono(Ticket.class);
		return bodyToMono;
	}
}
