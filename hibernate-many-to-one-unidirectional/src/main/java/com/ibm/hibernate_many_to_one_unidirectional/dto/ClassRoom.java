package com.ibm.hibernate_many_to_one_unidirectional.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ClassRoom {

	@Id
	private int number;
	private int strength;
	private String floor;
	private String section;
}
