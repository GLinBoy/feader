package com.glinboy.feader.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.glinboy.feader.model.FeedEntry;
import com.glinboy.feader.repository.FeedEntryRepositoryApi;

@Service
public class FeedEntryServiceImpl
	extends FeederGenericServiceImpl<FeedEntry, FeedEntryRepositoryApi>
	implements FeedEntryServiceApi{

	FeedEntryServiceImpl(JpaRepository<FeedEntry, Long> repository) {
		super(repository);
	}

}
