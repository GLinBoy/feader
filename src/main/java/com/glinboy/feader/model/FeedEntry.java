package com.glinboy.feader.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true, exclude="feed")
public class FeedEntry extends BaseModel {

	private static final long serialVersionUID = -7086809764656937022L;
	
	@Column(length=128)
	private String title;
	
	@Lob
	private String description;
	
	@Column(length=512)
	private String link;
	
	@Column(length=64)
	private String author;
	
	@Column(length=40)
	private String guid;
	
	@ManyToOne
	@JoinColumn(name="feed_id", nullable=false)
	private Feed feed;
}
