package com.web.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
	@Entity
	public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotEmpty
	    private String firstName;

	    @NotEmpty
	    private String lastName;

	    @NotNull
	@Past(message = "Birth date should be in the past  ")

	    private LocalDate dob;

	    @NotEmpty
	    private String address;

	    // getters and setters
	}


