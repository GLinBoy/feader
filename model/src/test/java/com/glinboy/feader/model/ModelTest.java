package com.glinboy.feader.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

/**
 * This is base class for model test and every model tests must extends this class
 * 
 * @author GLinBoy
 *
 * @param <T>
 */
public abstract class ModelTest<T extends BaseModel> {
	
	
	/**
	 * This method must return current object created from T
	 * @return object with type T
	 */
	public abstract T getCurrentModelObject();
	
	
	/**
	 * This method must return class of T
	 * <br/>
	 * e.g.: <i>return Foo.class</i>
	 * @return class of type T
	 */
	public abstract Class<T> getCurrentModelClass();

	/**
	 * This method check all fields checked in tests
	 * 
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public 	void checkFeedFields() throws IllegalArgumentException, IllegalAccessException {
		Field[] allFields = getCurrentModelClass().getDeclaredFields();
	    for (Field field : allFields) {
	    	field.setAccessible(true);
	    	assertThat(field.get(getCurrentModelObject())).isNotNull();
	    }
	}
	
}
