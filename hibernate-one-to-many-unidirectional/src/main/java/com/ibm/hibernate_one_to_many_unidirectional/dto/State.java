package com.ibm.hibernate_one_to_many_unidirectional.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {

	@Id
	private int id;
	private String name;
	private String capitalName;
	private int noOfDistrict;
	
	@OneToMany
	@JoinTable(name="state-district",
			joinColumns = @JoinColumn(name="state-id"),
			inverseJoinColumns = @JoinColumn(name="district-id")
			)
	List<District> districts;
}
