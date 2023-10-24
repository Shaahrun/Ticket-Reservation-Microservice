package com.gmail.ejikemesharon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TicketService {

    //@Autowired
    //private TicketRepository ticketRepository;
    private WebClient webClient;

    public boolean purchaseTickets(String flightCode) {
        String url = "http://localhost:8080/api/inventory/" + flightCode;
       Boolean available = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

       return available;
    }
}
