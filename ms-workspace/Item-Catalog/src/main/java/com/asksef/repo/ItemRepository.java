package com.asksef.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.asksef.model.Item;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {

}
