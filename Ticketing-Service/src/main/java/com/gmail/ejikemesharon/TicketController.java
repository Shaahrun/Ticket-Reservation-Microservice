package com.gmail.ejikemesharon;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/book/")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    private TicketRepository ticketRepository;

    @PostMapping("/{flightCode}")
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallBack")
    public ResponseEntity<String> purchaseTicket(@RequestBody Ticket ticket, @PathVariable String flightCode) {
        Boolean success = ticketService.purchaseTickets(flightCode);

        if (success) {
            ticketRepository.save(ticket);
            SuccessResponse response = new SuccessResponse();
            String message = response.successMessage(ticket);
            return new ResponseEntity<>(message, HttpStatus.OK);
        } else {
            String message = "Sorry, all seats for flight " + flightCode + " have been taken.";
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> fallBack(Ticket ticket, RuntimeException exception) {
        String message = "Inventory service is currently down, please try again later";
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
