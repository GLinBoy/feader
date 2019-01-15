package com.glinboy.feader.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.feader.model.Category;
import com.glinboy.feader.repository.CategoryRepositoryApi;

public class CategoryServiceImpl extends FeederGenericServiceImpl<Category, CategoryRepositoryApi> {

	CategoryServiceImpl(JpaRepository<Category, Long> repository) {
		super(repository);
	}

}
