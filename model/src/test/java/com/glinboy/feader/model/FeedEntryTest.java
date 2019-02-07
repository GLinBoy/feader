package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

public class FeedEntryTest {
	
	@Test
	public void newFeedEntry() {
		java.util.UUID.randomUUID();
		String desc = "I really like Project Lombok, with use of this library you can code cleaner,"
				+ "just look at the sample of  @Data (here) and you give me the right!\n"
				+ "But after using @Data on an entity, and use it into another entity"
				+ "(eg a Set of comments of a post), throw an ugly error:"
				+ "java.lang.StackOverflowError: null. ";
		FeedEntry entry = new FeedEntry();
		entry.setId(1L);
		entry.setGuid("1e28e6e0-243f-4337-a4ab-0ef3c866c6d6");
		entry.setAuthor("John Doe");
		entry.setTitle("Lombok, Hibernate, and 'StackOverflowError: null' Exception!");
		entry.setLink("https://blog.glinboy.com/2019/02/lombok-hibernate-and-stackoverflow-error.html");
		entry.setDescription(desc);
		Feed feed = new Feed();
		feed.setId(1L);
		entry.setFeed(feed);
		
		assertThat(entry.getId()).isEqualTo(1L);
		assertThat(entry.getGuid()).isEqualTo("1e28e6e0-243f-4337-a4ab-0ef3c866c6d6");
		assertThat(entry.getAuthor()).isEqualTo("John Doe");
		assertThat(entry.getTitle()).isEqualTo("Lombok, Hibernate, and 'StackOverflowError: null' Exception!");
		assertThat(entry.getLink()).isEqualTo("https://blog.glinboy.com/2019/02/lombok-hibernate-and-stackoverflow-error.html");
		assertThat(entry.getDescription()).isEqualTo(desc);
		assertThat(entry.getFeed().getId()).isEqualTo(feed.getId());
	}

	@Test
	void checkFeedFields() throws IllegalArgumentException, IllegalAccessException {
		FeedEntry entry = new FeedEntry();
		entry.setId(1L);
		entry.setGuid("1e28e6e0-243f-4337-a4ab-0ef3c866c6d6");
		entry.setAuthor("John Doe");
		entry.setTitle("Lombok, Hibernate, and 'StackOverflowError: null' Exception!");
		entry.setDescription("I really like Project Lombok, with use of this library you can code cleaner,"
				+ "just look at the sample of  @Data (here) and you give me the right!\n"
				+ "But after using @Data on an entity, and use it into another entity"
				+ "(eg a Set of comments of a post), throw an ugly error:"
				+ "java.lang.StackOverflowError: null. ");
		entry.setLink("https://blog.glinboy.com/2019/02/lombok-hibernate-and-stackoverflow-error.html");
		entry.setFeed(new Feed());
		
	    Field[] allFields = FeedEntry.class.getDeclaredFields();
	    for (Field field : allFields) {
	    	field.setAccessible(true);
	    	assertThat(field.get(entry)).isNotNull();
	    }
	}

}
