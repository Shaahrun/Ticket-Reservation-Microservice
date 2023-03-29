package com.gmail.ejikemesharon;

import java.util.UUID;

public class SuccessResponse {

    SuccessResponse() {}

    public String successMessage(Ticket ticket) {
        UUID uniqueId = UUID.randomUUID();

        return "Dear, " + ticket.getPassengerName() +
                "you have successfully purchased a ticket for the " + ticket.getDepartureTime() +
                " flight leaving " + ticket.getTakeOff() +
                " to " + ticket.getDestination() +
                ". Your unique pass code is " + uniqueId +
                ". Please keep it safe, as it'll be used at check-in to obtain a boarding pass.";
    }
}
