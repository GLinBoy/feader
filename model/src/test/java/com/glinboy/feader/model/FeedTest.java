package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class FeedTest {

	@Test
	void newFeed() {
		Feed feed = new Feed();
		feed.setId(1L);
		feed.setTitle("GLinBoy");
		feed.setLink("https://blog.glinboy.com/feeds/posts/default");
		feed.setDescription("GLinBoy's blog about programming & developing"
				+ "(cover Java, Python, C++, Rust, Go, Elixir and their frameworks)");
		Category category = new Category();
		category.setId(1L);
		category.setName("unnamed");
		category.setWeight((short) 1);
		feed.setCategory(new HashSet<Category>() {
			private static final long serialVersionUID = -2952632067668036802L;
			{
				add(category);
			}
		});

		assertThat(feed.getId()).isEqualTo(1L);
		assertThat(feed.getTitle()).isEqualTo("GLinBoy");
		assertThat(feed.getLink()).isEqualTo("https://blog.glinboy.com/feeds/posts/default");
		assertThat(feed.getDescription()).isEqualTo("GLinBoy's blog about programming & developing"
				+ "(cover Java, Python, C++, Rust, Go, Elixir and their frameworks)");
		assertThat(feed.getCategory().stream().mapToLong(Category::getId)).containsAnyOf(category.getId());
	}

	@Test
	void checkFeedFields() throws IllegalArgumentException, IllegalAccessException {
		Feed feed = new Feed();
		feed.setId(1L);
		feed.setTitle("GLinBoy");
		feed.setLink("https://blog.glinboy.com/feeds/posts/default");
		feed.setDescription("GLinBoy's blog about programming & developing"
				+ "(cover Java, Python, C++, Rust, Go, Elixir and their frameworks)");
		feed.setCategory(new HashSet<Category>());
		feed.setEntries(new HashSet<FeedEntry>());

	    Field[] allFields = Feed.class.getDeclaredFields();
	    for (Field field : allFields) {
	    	field.setAccessible(true);
	    	assertThat(field.get(feed)).isNotNull();
	    }
	}

}
