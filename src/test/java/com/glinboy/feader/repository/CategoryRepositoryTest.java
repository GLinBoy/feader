package com.glinboy.feader.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.glinboy.feader.model.Category;

public class CategoryRepositoryTest extends RepositoryTestParent<Category, CategoryRepositoryApi> {
	
	private Category defaultCategory;
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
	private CategoryRepositoryApi categoryRepository;
	

	@BeforeEach
	public void setupBeforeEachTest() {
		Category category = new Category();
		category.setName("unnamed");
		category.setWeight((short) 1);
		this.defaultCategory = entityManager.persistAndFlush(category);
		assertThat(this.defaultCategory.getId()).isNotNull().isGreaterThan(0);
	}
	
	@Test
	public void readEntity() {
		Category one = this.categoryRepository.getOne(this.defaultCategory.getId());
		assertThat(one.getId()).isEqualTo(this.defaultCategory.getId());
	}
	
	@Test
	public void saveEntity() {
		long beforeAdd = categoryRepository.count();
		Category category = new Category();
		category.setName("unnamed");
		category.setWeight((short) 1);
		categoryRepository.save(category);
		assertThat(category.getId()).isGreaterThan(0);
		long afterAdd = categoryRepository.count();
		assertThat(beforeAdd + 1).isEqualTo(afterAdd);
	}

	@Test
	public void updateEntity() {
		long beforeAdd = categoryRepository.count();
		defaultCategory.setName("Development Blog");
		categoryRepository.save(defaultCategory);
		Category one = categoryRepository.getOne(defaultCategory.getId());
		assertThat(one.getName()).isEqualTo(defaultCategory.getName());
		long afterAdd = categoryRepository.count();
		assertThat(beforeAdd).isEqualTo(afterAdd);
	}
	
	@Test
	public void deleteEntity() {
		long beforeDelete = categoryRepository.count();
		categoryRepository.delete(defaultCategory);
		long afterDelete = categoryRepository.count();
		assertThat(beforeDelete - 1).isEqualTo(afterDelete);
	}
}
