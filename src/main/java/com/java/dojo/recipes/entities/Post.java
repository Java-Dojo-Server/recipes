package com.java.dojo.recipes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Builder
@Table(name = "post")
public class Post {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private Long user_id;
	private String username;
	private String imageUrl;
	private String title;
	private String content;
	private String data;
	
}
