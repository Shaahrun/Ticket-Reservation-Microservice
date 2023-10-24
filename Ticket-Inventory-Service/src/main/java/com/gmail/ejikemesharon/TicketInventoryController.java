package com.gmail.ejikemesharon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class TicketInventoryController {
    @Autowired
    private TicketInventoryService ticketInventoryService;

    @GetMapping("/{flightCode}")
    public boolean availableSeats(@PathVariable String flightCode) {
        return ticketInventoryService.isInStock(flightCode);
    }

    @PostMapping
    public ResponseEntity<TicketInv> addTickets(@RequestBody TicketInv ticketInv) {
        ticketInventoryService.addTickets(ticketInv);
        return new ResponseEntity<>(ticketInv, HttpStatus.CREATED);
    }
}
