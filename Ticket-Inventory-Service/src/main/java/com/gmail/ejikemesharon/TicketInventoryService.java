package com.gmail.ejikemesharon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketInventoryService {

    @Autowired
    private TicketInvRepository invRepository;


}
