package com.glinboy.feader.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.glinboy.feader.model.Category;
import com.glinboy.feader.model.Feed;
import com.glinboy.feader.model.FeedEntry;

public class FeedEntryRepositoryTest extends RepositoryTestParent<FeedEntry, FeedEntryRepositoryApi> {
	
	private Feed defaultFeed;
	private Category defaultCategory;
	private FeedEntry defaultEntry;
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
	private FeedEntryRepositoryApi entryRepository;
	
	@BeforeEach
	public void setupBeforeEachTest() {
		String desc = "I really like Project Lombok, with use of this library you can code cleaner,"
				+ "just look at the sample of  @Data (here) and you give me the right!\n"
				+ "But after using @Data on an entity, and use it into another entity"
				+ "(eg a Set of comments of a post), throw an ugly error:"
				+ "java.lang.StackOverflowError: null. ";
		
		
		Category category = new Category();
		category.setName("unnamed");
		category.setWeight((short) 1);
		this.defaultCategory = entityManager.persistAndFlush(category);
		
		Feed feed = new Feed();
		feed = new Feed();
		feed.setTitle("GLinBoy");
		feed.setLink("https://blog.glinboy.com/feeds/posts/default");
		feed.setDescription("GLinBoy's blog about programming & developing"
				+ "(cover Java, Python, C++, Rust, Go, Elixir and their frameworks)");
		feed.setCategory(new HashSet<Category>() {
			private static final long serialVersionUID = -2952632067668036802L;
			{
				add(defaultCategory);
			}
		});
		this.defaultFeed = entityManager.persistAndFlush(feed);
		
		FeedEntry entry = new FeedEntry();
		entry.setGuid("1e28e6e0-243f-4337-a4ab-0ef3c866c6d6");
		entry.setAuthor("John Doe");
		entry.setTitle("Lombok, Hibernate, and 'StackOverflowError: null' Exception!");
		entry.setLink("https://blog.glinboy.com/2019/02/lombok-hibernate-and-stackoverflow-error.html");
		entry.setDescription(desc);
		entry.setFeed(feed);
		this.defaultEntry = entityManager.persistAndFlush(entry);
		assertThat(this.defaultEntry.getId()).isNotNull().isGreaterThan(0);
	}

	@Test
	public void readEntity() {
		FeedEntry one = entryRepository.getOne(this.defaultEntry.getId());
		assertThat(one.getId()).isEqualTo(defaultEntry.getId());
	}

	@Test
	public void saveEntity() {
		long beforeAdd = entryRepository.count();
		FeedEntry entry = new FeedEntry();
		entry.setGuid("1e28e6e0-243f-4337-a4ab-0ef3c866c6d6");
		entry.setAuthor("John Doe");
		entry.setTitle("Lombok, Hibernate, and 'StackOverflowError: null' Exception!");
		entry.setLink("https://blog.glinboy.com/2019/02/lombok-hibernate-and-stackoverflow-error.html");
		entry.setDescription("desc");
		entry.setFeed(defaultFeed);
		entry = entryRepository.save(entry);
		assertThat(entry.getId()).isGreaterThan(0);
		long afterAdd = entryRepository.count();
		assertThat(beforeAdd + 1).isEqualTo(afterAdd);
	}

	@Test
	public void updateEntity() {
		long beforeAdd = entryRepository.count();
		defaultEntry.setDescription("desc");
		entryRepository.save(defaultEntry);
		FeedEntry one = entryRepository.getOne(defaultEntry.getId());
		assertThat(one.getDescription()).isEqualTo("desc");
		long afterAdd = entryRepository.count();
		assertThat(beforeAdd).isEqualTo(afterAdd);
	}

	@Test
	public void deleteEntity() {
		long beforeDelete = entryRepository.count();
		entryRepository.delete(defaultEntry);
		long afterDelete = entryRepository.count();
		assertThat(beforeDelete - 1).isEqualTo(afterDelete);
	}

}
