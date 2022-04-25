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
@Table(name = "comment")
public class Comment {
	private Long id;
	private Long post_id;
	private String username;
	private String content;
	private String data;

}
