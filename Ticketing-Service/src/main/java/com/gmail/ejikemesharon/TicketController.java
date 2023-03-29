package com.gmail.ejikemesharon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book/")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/{flightCode}")
    public ResponseEntity<?> purchaseTicket(@RequestBody Ticket ticket, @PathVariable String flightCode) {
        Boolean success = ticketService.purchaseTickets(flightCode);


    }
}
