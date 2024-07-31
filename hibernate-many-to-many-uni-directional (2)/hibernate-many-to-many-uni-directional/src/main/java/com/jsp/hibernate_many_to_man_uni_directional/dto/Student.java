package com.jsp.hibernate_many_to_man_uni_directional.dto;

import java.util.List;

import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false,unique = true)
	
	private transient long phone;
	
	@Column(name = "image",columnDefinition = "LONGBLOB")
	@Lob
	private byte[] image; 
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Subject> subjects;

	public Student(String name, String email, long phone, byte[] image, List<Subject> subject2) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.image = image;
		this.subjects = subjects;
	}
	
}
