package com.ibm.hibernate_simple_crud_operation.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee
{
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	private double salary;
	private LocalDate dob;
	private LocalDate doj;
}
