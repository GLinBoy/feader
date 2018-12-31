package com.glinboy.feader.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class FeedEntry extends BaseModel {

	private static final long serialVersionUID = -7086809764656937022L;
	private String title;
	private String description;
	private String link;
	private String author;
	private String guid;
}
