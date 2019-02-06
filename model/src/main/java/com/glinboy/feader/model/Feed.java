package com.glinboy.feader.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Feed extends BaseModel {

	private static final long serialVersionUID = 7720285113632455831L;
	
	private String title;
    private String link;
    
    @Lob
    private String description;
	
    @ManyToMany
    @JoinTable(name="feed_category",
    		joinColumns = @JoinColumn(name = "feed_id", nullable=false),
            inverseJoinColumns = @JoinColumn(name = "category_id", nullable=false))
    private Set<Category> category;

    @OneToMany(mappedBy="feed")
    private List<FeedEntry> entries;
}
