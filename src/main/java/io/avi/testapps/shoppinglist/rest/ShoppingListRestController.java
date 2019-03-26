package io.avi.testapps.shoppinglist.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.avi.testapps.shoppinglist.model.ShoppingItem;
import io.avi.testapps.shoppinglist.repo.ShoppingListRepository;

@RestController
@RequestMapping("/rest")
public class ShoppingListRestController {

    @Autowired
    public ShoppingListRepository shoppingRepo;
    
    @GetMapping
    public Iterable<ShoppingItem> getShoopingList() {
        return shoppingRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public ShoppingItem getItem(@RequestParam String id) {
        return shoppingRepo.findById(id).get();
    }
    
    @PutMapping
    public ShoppingItem addShoppingList(@RequestBody ShoppingItem item) {
        return shoppingRepo.save(item);
    }
    
    @DeleteMapping("/{id}")
    public void deleteItem(@RequestParam String id) {
        shoppingRepo.deleteById(id);
    }
}
