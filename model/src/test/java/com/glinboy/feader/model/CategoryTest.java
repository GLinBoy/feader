package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class CategoryTest {

	@Test
	public void newCategory() {
		Category category = new Category();
		category.setId(1L);
		category.setName("Test Category");
		category.setWeight((short) 1);
		Feed feed = new Feed();
		feed.setId(1L);
		category.setFeeds(new HashSet<Feed>() {
			private static final long serialVersionUID = -1187221931202361314L;

		{
			add(feed);
		}});
		
		assertThat(category.getId()).isEqualTo(1L);
		assertThat(category.getName()).isEqualTo("Test Category");
		assertThat(category.getWeight()).isEqualTo((short)1);
		assertThat(category.getFeeds().stream().mapToLong(Feed::getId)).containsAnyOf(feed.getId());
	}
	
	@Test
	void checkFeedFields() throws IllegalArgumentException, IllegalAccessException {
		Category category = new Category();
		category.setId(1L);
		category.setName("Test Category");
		category.setWeight((short) 1);
		category.setFeeds(new HashSet<Feed>() {
			private static final long serialVersionUID = -1187221931202361314L;

		{
			Feed feed = new Feed();
			feed.setId(1L);
			add(feed);
		}});
		
	    Field[] allFields = Category.class.getDeclaredFields();
	    for (Field field : allFields) {
	    	field.setAccessible(true);
	    	assertThat(field.get(category)).isNotNull();
	    }
	}
}
