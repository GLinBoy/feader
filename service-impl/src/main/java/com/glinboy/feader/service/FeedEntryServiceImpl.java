package com.glinboy.feader.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.feader.model.FeedEntry;
import com.glinboy.feader.repository.FeedEntryRepositoryApi;

public class FeedEntryServiceImpl extends FeederGenericServiceImpl<FeedEntry, FeedEntryRepositoryApi> {

	FeedEntryServiceImpl(JpaRepository<FeedEntry, Long> repository) {
		super(repository);
	}

}
