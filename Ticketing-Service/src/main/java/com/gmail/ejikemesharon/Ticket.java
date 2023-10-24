package com.gmail.ejikemesharon;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
       @Id
       @Column
       private Long id;
       @Column(name = "passenger")
       private String passengerName;
       @Column
       private  String takeOff;
       @Column
       private String destination;
       @Column(name = "departure")
       private String departureTime;

}
