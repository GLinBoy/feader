package com.glinboy.feader.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.glinboy.feader.model.BaseModel;

public abstract class FeederGenericServiceImpl<T extends BaseModel, S extends JpaRepository<T, Long>>
		implements FeederGenericServiceApi<T> {

	protected final S repository;
	
	@SuppressWarnings("unchecked")
	FeederGenericServiceImpl(JpaRepository<T, Long> repository) {
		this.repository = (S) repository;
	}

	@Override
	@Transactional
	public T save(T t) {
		return repository.save(t);
	}

	@Override
	@Transactional
	public T update(T t) {
		final Long id = t.getId();
		T obj = repository.findById(id).orElseThrow(() -> new RuntimeException("Resource found with id = " + id));
		// FIXME Handle update;
		return repository.save(obj);
	}

	@Override
	public T getSingleById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Page<T> getAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Page<T> findAll() {
// TODO apply search
		return null;
	}

	@Override
	@Transactional
	public void deleteSingleById(Long id) {
		repository.findById(id).orElseThrow(() -> new RuntimeException("Resource found with id = " + id));
		repository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteSingleByReference(T t) {
		repository.findById(t.getId())
				.orElseThrow(() -> new RuntimeException("Resource found with id = " + t.getId()));
		repository.delete(t);
	}

	@Override
	@Transactional
	public void deleteAll() {
		repository.deleteAll();
	}
}
