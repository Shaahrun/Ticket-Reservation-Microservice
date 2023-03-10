package com.gmail.ejikemesharon;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TicketInv {

    @Id
    private long id;
    private String flightCode;
    private int availableSeats;
}
