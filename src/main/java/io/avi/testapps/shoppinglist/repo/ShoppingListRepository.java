package io.avi.testapps.shoppinglist.repo;

import org.springframework.data.repository.CrudRepository;

import io.avi.testapps.shoppinglist.model.ShoppingItem;

public interface ShoppingListRepository extends CrudRepository<ShoppingItem, String> {
}
