package com.gmail.ejikemesharon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketInventoryService {

    @Autowired
    private TicketInvRepository invRepository;

    public boolean isInStock(String flightCode) {
        TicketInv ticket = invRepository.findByFlightCode(flightCode);

        if (ticket != null) {

            int seats = ticket.getAvailableSeats();

            return seats > 0;
        } else return false;
    }

    public void addTickets(TicketInv ticketInv) {
        invRepository.save(ticketInv);
    }
}
