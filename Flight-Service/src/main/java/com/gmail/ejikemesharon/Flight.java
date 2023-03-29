package com.gmail.ejikemesharon;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    private String takeOff;
    private String destination;
    private String timeOfDay;
    private String flightCode;
    private Date dayOfFlight;
}
