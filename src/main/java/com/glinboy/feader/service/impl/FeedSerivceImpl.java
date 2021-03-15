package com.glinboy.feader.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.glinboy.feader.model.Feed;
import com.glinboy.feader.repository.FeedRepositoryApi;
import com.glinboy.feader.service.FeedServiceApi;

import lombok.EqualsAndHashCode;

@Service
@EqualsAndHashCode(callSuper = true)
public class FeedSerivceImpl
	extends FeederGenericServiceImpl<Feed, FeedRepositoryApi>
	implements FeedServiceApi{
	
	FeedSerivceImpl(JpaRepository<Feed, Long> repository) {
		super(repository);
	}
	
}
