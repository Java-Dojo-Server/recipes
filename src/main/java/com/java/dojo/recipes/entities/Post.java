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
@Table(name = "post")
public class Post {

	private Long id;
	private Long user_id;
	private String username;
	private String imageUrl;
	private String title;
	private String content;
	private String data;
	
}
