package com.ibm.hibernate_one_to_many_unidirectional.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {

	@Id
	private int id;
	private String name;
	private long population;
	private LocalDate establishYear;
	
}
