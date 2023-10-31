package com.ritikkanswal.springboot.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="candidates")
public class Candidate {
	
	@Getter
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Getter
	@Column(name="first_name")
	private String firstName;
	
	@Getter
	@Column(name="last_name")
	private String lastName;
	
	
	@Getter
	@Column(name="email_id")
	private String emailId;
	
	@Getter
	@ManyToOne
	private College college;
	
	@Getter
	@Setter
	@Column(name="gender")
	private String gender;

}
