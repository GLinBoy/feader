package com.glinboy.feader.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.glinboy.feader.model.Category;
import com.glinboy.feader.repository.CategoryRepositoryApi;
import com.glinboy.feader.service.CategoryServiceApi;

@Service
public class CategoryServiceImpl
	extends FeederGenericServiceImpl<Category, CategoryRepositoryApi>
	implements CategoryServiceApi{

	CategoryServiceImpl(JpaRepository<Category, Long> repository) {
		super(repository);
	}

}
