package com.glinboy.feader.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.glinboy.feader.model.Category;

public interface CategoryRepositoryApi extends JpaRepository<Category, Long> {
	@Override
    @Query("select category from Category category left join fetch category.feeds")
    List<Category> findAll();
}
