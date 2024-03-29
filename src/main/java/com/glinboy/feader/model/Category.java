package com.glinboy.feader.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@EqualsAndHashCode(callSuper=true, exclude="feeds")
public class Category extends BaseModel {
	
	private static final long serialVersionUID = -8390228973883986191L;

	@Column(length=32, nullable=false)
	private String name;

	@Column(nullable=false)
	private Short weight;

	@ManyToMany(mappedBy="category")
	private Set<Feed> feeds;
}
