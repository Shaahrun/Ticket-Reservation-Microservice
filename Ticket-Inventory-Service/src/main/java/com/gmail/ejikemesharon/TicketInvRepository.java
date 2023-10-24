package com.gmail.ejikemesharon;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketInvRepository extends MongoRepository<TicketInv, Long> {

    TicketInv findByFlightCode(String flightCode);

    int findByAvailableSeats(String flightCode);
}
