package com.bhozida.onlinebookstore;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import com.bhozida.onlinebookstore.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
  
  @Autowired
  private EntityManager entityManager;
@Override
public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
  
  config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
  .map(Type::getJavaType)
  .toArray(Class[]::new));
  //config.exposeIdsFor(Book.class);
  //config.exposeIdsFor(BookCategory.class);
}

}