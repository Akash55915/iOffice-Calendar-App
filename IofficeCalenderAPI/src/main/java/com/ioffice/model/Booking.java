package com.ioffice.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ioffice.exception.SQLTimeDeserializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="booking_id")
    private int bookingId;
    
    @OneToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "aduitoriam_id")
    private Auditoriums aduitoriamId;
    
    @ManyToOne (cascade = CascadeType.ALL) 
    @JoinColumn(name = "user_id")
    private User userId;
    
    @Column(name="booking_date_from")
    private Date bookingDateFrom;
    
    @Column(name="booking_date_to")
    private Date bookingDateTo;
    
    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = SQLTimeDeserializer.class)
  

	@Column(name="booking_time_from")
	private Time bookingTimeFrom;
	
    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = SQLTimeDeserializer.class)
  
	@Column(name="booking_time_to")
	private Time bookingTimeTO;
    
    @Column(name="booking_agenda")
    private String bookingAgenda;

}

