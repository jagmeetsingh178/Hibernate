package com.jsp.hibernate_many_to_man_uni_directional.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String author;
	@Column(nullable = false)
	private double price;
	
	@ManyToMany(mappedBy = "subjects")
	List<Student> students;
	
	public Subject(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	
}
