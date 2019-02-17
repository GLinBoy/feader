package com.glinboy.feader.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;

import com.glinboy.feader.model.Category;
import com.glinboy.feader.model.Feed;

public class FeedRepositoryTest extends RepositoryTestParent<Feed, FeedRepositoryApi> {

	private Feed defaultFeed;
	
	private Category defaultCategory;
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
	private FeedRepositoryApi feedRepository;
	
	@BeforeEach
	public void setupBeforeEachTest() {
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
		assertThat(this.defaultFeed.getId()).isNotNull().isGreaterThan(0);
	}

	@Test
	public void readEntity() {
		Feed readed = feedRepository.getOne(this.defaultFeed.getId());
		assertThat(readed.getId()).isEqualTo(this.defaultFeed.getId());
	}

	@Test
	public void saveEntity() {
		long beforeAdd = feedRepository.count();
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
		feed = feedRepository.save(feed);
		long afterAdd = feedRepository.count();
		assertThat(feed.getId()).isGreaterThan(0);
		assertThat(beforeAdd + 1).isEqualTo(afterAdd);
	}

	@Test
	public void updateEntity() {
		long beforeAdd = feedRepository.count();
		defaultFeed.setTitle("GLinBoy Weblog");
		feedRepository.save(defaultFeed);
		Feed one = feedRepository.getOne(defaultFeed.getId());
		assertThat(one.getTitle()).isEqualTo("GLinBoy Weblog");
		long afterAdd = feedRepository.count();
		assertThat(beforeAdd).isEqualTo(afterAdd);
	}

	@Test
	public void deleteEntity() {
		long beforeAdd = feedRepository.count();
		Long id = defaultFeed.getId();
		feedRepository.delete(this.defaultFeed);
		long afterAdd = feedRepository.count();
		assertThat(beforeAdd - 1).isEqualTo(afterAdd);
		try {
			feedRepository.getOne(id);
		} catch (JpaObjectRetrievalFailureException ex) {
			assert(ex.toString())
				.endsWith("Unable to find com.glinboy.feader.model.Feed with id "
						+ id.toString());
		} catch (Exception ex) {
			fail("Exception throws that we don't except");
		}
	}
}
