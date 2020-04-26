package br.com.lhamello.onlinebookstore.infra.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

  private final EntityManager entityManager;
  
  public RepositoryConfig(final EntityManager entityManager) {
    this.entityManager = entityManager;
  }
  
  @Override
  public void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config) {
    config.exposeIdsFor(
        entityManager.getMetamodel()
                     .getEntities()
                     .stream()
                     .map(Type::getJavaType)
                     .toArray(Class[]::new));
  }
}
