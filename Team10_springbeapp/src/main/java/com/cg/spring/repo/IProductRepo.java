package com.cg.spring.repo;

import org.springframework.data.repository.CrudRepository;

import com.cg.spring.beans.Product;

public interface IProductRepo extends CrudRepository<Product, Integer>{

}
