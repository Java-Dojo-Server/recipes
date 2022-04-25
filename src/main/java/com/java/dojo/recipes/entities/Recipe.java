package com.java.dojo.recipes.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Recipe {
	
	private List<String> ingredients = new ArrayList<>();
	private List<String> preparingMode = new ArrayList<>();
	

}
