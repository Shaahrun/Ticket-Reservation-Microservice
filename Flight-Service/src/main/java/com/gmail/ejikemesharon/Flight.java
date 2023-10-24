package com.gmail.ejikemesharon;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Entity
@Table(name = "flight")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    @Id
    private Long id;
    private String takeOff;
    private String destination;
    private String timeOfDay;
    private String flightCode;
    private Date dayOfFlight;
}
