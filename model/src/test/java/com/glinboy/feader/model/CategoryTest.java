package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CategoryTest extends ModelTest<Category> {

	private Category category;

	@BeforeEach
	public void setupFreshCategory() {

		this.category = new Category();
		this.category.setId(1L);
		this.category.setName("Test Category");
		this.category.setWeight((short) 1);
		Feed feed = new Feed();
		feed.setId(1L);
		this.category.setFeeds(new HashSet<Feed>() {
			private static final long serialVersionUID = -1187221931202361314L;

			{
				add(feed);
			}
		});
	}

	@Test
	public void newCategory() {

		assertThat(this.category.getId()).isEqualTo(1L);
		assertThat(this.category.getName()).isEqualTo("Test Category");
		assertThat(this.category.getWeight()).isEqualTo((short) 1);
		assertThat(this.category.getFeeds().stream().mapToLong(Feed::getId)).containsAnyOf(1L);
	}

	@Override
	public Category getCurrentModelObject() {
		return this.category;
	}

	@Override
	public Class<Category> getCurrentModelClass() {
		return Category.class;
	}

}
