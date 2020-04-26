package br.com.lhamello.onlinebookstore.domain.model.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategories", path = "book-categories")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
