package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

public abstract class ModelTest<T> {
	
	public abstract T getCurrentModelObject();
	public abstract Class<T> getCurrentModelClass();

	@Test
	void checkFeedFields() throws IllegalArgumentException, IllegalAccessException {
		Field[] allFields = getCurrentModelClass().getDeclaredFields();
	    for (Field field : allFields) {
	    	field.setAccessible(true);
	    	assertThat(field.get(getCurrentModelObject())).isNotNull();
	    }
	}
	
}
