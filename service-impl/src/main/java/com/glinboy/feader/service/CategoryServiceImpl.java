package com.glinboy.feader.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.glinboy.feader.model.Category;
import com.glinboy.feader.repository.CategoryRepositoryApi;

@Service
public class CategoryServiceImpl
	extends FeederGenericServiceImpl<Category, CategoryRepositoryApi>
	implements CategoryServiceApi{

	CategoryServiceImpl(JpaRepository<Category, Long> repository) {
		super(repository);
	}

}
