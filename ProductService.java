package com.rollingstone.spring.service;

import java.util.List;
import java.util.Optional;

import com.rollingstone.spring.model.Product;

public interface ProductService {

   Product save(Product product);
   Optional<Product> get(long id);
   List<Product> list();
   void update(long id, Product category);
   void delete(long id);
}
