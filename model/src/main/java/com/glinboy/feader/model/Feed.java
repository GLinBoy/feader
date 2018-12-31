package com.glinboy.feader.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Feed extends BaseModel {

	private static final long serialVersionUID = 1L;

	private String title;
    private String link;
    private String description;
	
}
