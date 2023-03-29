package com.gmail.ejikemesharon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
       private String passengerName;
       private  String takeOff;
       private String destination;
       private String departureTime;

}
