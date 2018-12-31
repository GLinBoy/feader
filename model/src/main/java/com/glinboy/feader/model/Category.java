package com.glinboy.feader.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Category extends BaseModel {
	
	private static final long serialVersionUID = -8390228973883986191L;

	private String name;
	private Integer weight;

}
