package com.glinboy.feader.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Category extends BaseModel {
	
	private static final long serialVersionUID = -8390228973883986191L;

	private String name;
	private Integer weight;

	@ManyToMany(mappedBy="category")
	private Set<Feed> feeds;
}
