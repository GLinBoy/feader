package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FeedTest extends ModelTest<Feed>{

	private Feed feed;

	@BeforeEach
	public void setupFreshFeed() {
		this.feed = new Feed();
		this.feed.setId(1L);
		this.feed.setTitle("GLinBoy");
		this.feed.setLink("https://blog.glinboy.com/feeds/posts/default");
		this.feed.setDescription("GLinBoy's blog about programming & developing"
				+ "(cover Java, Python, C++, Rust, Go, Elixir and their frameworks)");
		Category category = new Category();
		category.setId(1L);
		category.setName("unnamed");
		category.setWeight((short) 1);
		this.feed.setCategory(new HashSet<Category>() {
			private static final long serialVersionUID = -2952632067668036802L;
			{
				add(category);
			}
		});
		this.feed.setEntries(new HashSet<FeedEntry>());
	}

	@Test
	void newFeed() {
		assertThat(this.feed.getId()).isEqualTo(1L);
		assertThat(this.feed.getTitle()).isEqualTo("GLinBoy");
		assertThat(this.feed.getLink()).isEqualTo("https://blog.glinboy.com/feeds/posts/default");
		assertThat(this.feed.getDescription()).isEqualTo("GLinBoy's blog about programming & developing"
				+ "(cover Java, Python, C++, Rust, Go, Elixir and their frameworks)");
		assertThat(this.feed.getCategory().stream().mapToLong(Category::getId)).containsAnyOf(1L);
	}

	@Override
	public Feed getCurrentModelObject() {
		return this.feed;
	}

	@Override
	public Class<Feed> getCurrentModelClass() {
		return Feed.class;
	}

}
