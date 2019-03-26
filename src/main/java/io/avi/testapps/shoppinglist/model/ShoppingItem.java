package io.avi.testapps.shoppinglist.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Document(collection = "items")
@JsonIgnoreProperties(value = "{target}")
public class ShoppingItem {
    
    @Id
    private String id;
    
    @NotEmpty(message = "{shopping.list.mandatory}")
    @Pattern(regexp = "[a-z][A-Z]*", message = "{shopping.list.alphanumeric}")
    private String item;
    
}
