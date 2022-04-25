package com.java.dojo.recipes.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@EqualsAndHashCode(of = "id")
@Table(name = "user")
public class User {

	private Long id;
	private String name;
	private String surname;
	private String email;
	private String password;
}
