package com.ibm.hibernate_one_to_one_uniderctional.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Country
{
	@Id
	private int id;
	private String name;
	private long population;
	private int no_of_state;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Capital capital;
}
