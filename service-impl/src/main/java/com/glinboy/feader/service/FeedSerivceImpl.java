package com.glinboy.feader.service;

import org.springframework.stereotype.Service;

import com.glinboy.feader.model.Feed;
import com.glinboy.feader.repository.FeedRepositoryApi;

import lombok.EqualsAndHashCode;

@Service
@EqualsAndHashCode(callSuper = true)
public class FeedSerivceImpl
	extends FeederGenericServiceImpl<Feed, FeedRepositoryApi>
	implements FeedServiceApi{
	
	private final FeedRepositoryApi repository;
	
	FeedSerivceImpl(FeedRepositoryApi repository) {
		super(repository);
		this.repository = repository;
	}

}
