package com.glinboy.feader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glinboy.feader.model.FeedEntry;

public interface FeedEntryRepositoryApi extends JpaRepository<FeedEntry, Long> {

}
