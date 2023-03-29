package com.gmail.ejikemesharon;

import org.springframework.stereotype.Repository;

@Repository
public interface TicketInvRepository extends JpaRepository {

    void findByFlightCode(String flightCode);
}
