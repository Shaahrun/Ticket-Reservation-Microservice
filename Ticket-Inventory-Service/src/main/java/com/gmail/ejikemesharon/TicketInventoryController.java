package com.gmail.ejikemesharon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class TicketInventoryController {

    @GetMapping("/{flightCode}")
    public boolean availableSeats(@PathVariable String flightCode) {

    }
}
