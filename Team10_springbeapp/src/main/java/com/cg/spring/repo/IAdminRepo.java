package com.cg.spring.repo;

import org.springframework.data.repository.CrudRepository;

import com.cg.spring.beans.Admin;

public interface IAdminRepo extends CrudRepository<Admin, Integer> {

}
