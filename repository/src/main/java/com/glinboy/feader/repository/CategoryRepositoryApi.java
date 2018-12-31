package com.glinboy.feader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.feader.model.Category;

public interface CategoryRepositoryApi extends JpaRepository<Category, Long> {

}
