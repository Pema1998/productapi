package com.rollingstone.spring.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.rollingstone.spring.model.Product;

public interface ProductDaoRepository extends PagingAndSortingRepository{
	
	List<Product> findAll();
}
