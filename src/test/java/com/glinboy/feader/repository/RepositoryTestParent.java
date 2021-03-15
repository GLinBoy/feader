package com.glinboy.feader.repository;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.glinboy.feader.model.BaseModel;


@ExtendWith(SpringExtension.class)
@DataJpaTest
public abstract class RepositoryTestParent<T extends BaseModel, R extends JpaRepository<T, Long>> {
	
	public abstract void readEntity();
	public abstract void saveEntity();
	public abstract void updateEntity();
	public abstract void deleteEntity();
}
