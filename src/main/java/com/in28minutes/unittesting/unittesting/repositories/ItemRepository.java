package com.in28minutes.unittesting.unittesting.repositories;

import com.in28minutes.unittesting.unittesting.model.Item;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
