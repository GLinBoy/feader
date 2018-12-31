package com.glinboy.feader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.feader.model.Feed;

public interface FeedRepositoryApi extends JpaRepository<Feed, Long> {

}
