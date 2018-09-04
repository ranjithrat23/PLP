package com.cg.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Cart;

@Repository("cartRepo")
public interface ICartRepo extends CrudRepository<Cart, Integer>{

}
