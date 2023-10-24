package com.gmail.ejikemesharon;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("inventory")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TicketInv {

    @Id
    private long id;
    @Field("code")
    private String flightCode;
    @Field("seats")
    private int availableSeats;
}
