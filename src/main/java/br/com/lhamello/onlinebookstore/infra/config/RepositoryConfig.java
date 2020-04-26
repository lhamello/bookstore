package br.com.lhamello.onlinebookstore.infra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import br.com.lhamello.onlinebookstore.domain.model.book.Book;
import br.com.lhamello.onlinebookstore.domain.model.book.BookCategory;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config) {
    config.exposeIdsFor(Book.class);
    config.exposeIdsFor(BookCategory.class);
  }
}
