package com.glinboy.feader.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class FeedEntry extends BaseModel {

	private static final long serialVersionUID = -7086809764656937022L;
	private String title;
	
	@Lob
	private String description;
	private String link;
	private String author;
	private String guid;
	
	@ManyToOne
	@JoinColumn(name="feed_id", nullable=false)
	private Feed feed;
}
