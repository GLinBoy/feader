package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FeedEntryTest extends ModelTest<FeedEntry> {
	
	private FeedEntry entry;
	private String desc = "I really like Project Lombok, with use of this library you can code cleaner,"
			+ "just look at the sample of  @Data (here) and you give me the right!\n"
			+ "But after using @Data on an entity, and use it into another entity"
			+ "(eg a Set of comments of a post), throw an ugly error:"
			+ "java.lang.StackOverflowError: null. ";
	
	@BeforeEach
	public void setupFreshFeedEntry() {
		this.entry = new FeedEntry();
		this.entry.setId(1L);
		this.entry.setGuid("1e28e6e0-243f-4337-a4ab-0ef3c866c6d6");
		this.entry.setAuthor("John Doe");
		this.entry.setTitle("Lombok, Hibernate, and 'StackOverflowError: null' Exception!");
		this.entry.setLink("https://blog.glinboy.com/2019/02/lombok-hibernate-and-stackoverflow-error.html");
		this.entry.setDescription(desc);
		Feed feed = new Feed();
		feed.setId(1L);
		this.entry.setFeed(feed);
	}
	
	@Test
	public void newFeedEntry() {
		assertThat(this.entry.getId()).isEqualTo(1L);
		assertThat(this.entry.getGuid()).isEqualTo("1e28e6e0-243f-4337-a4ab-0ef3c866c6d6");
		assertThat(this.entry.getAuthor()).isEqualTo("John Doe");
		assertThat(this.entry.getTitle()).isEqualTo("Lombok, Hibernate, and 'StackOverflowError: null' Exception!");
		assertThat(this.entry.getLink()).isEqualTo("https://blog.glinboy.com/2019/02/lombok-hibernate-and-stackoverflow-error.html");
		assertThat(this.entry.getDescription()).isEqualTo(desc);
		assertThat(this.entry.getFeed().getId()).isEqualTo(1L);
	}

	@Override
	public FeedEntry getCurrentModelObject() {
		return this.entry;
	}

	@Override
	public Class<FeedEntry> getCurrentModelClass() {
		return FeedEntry.class;
	}

}
