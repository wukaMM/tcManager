package com.my.test.tcManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.my.test.tcManager.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	Person findByUsername(String username);
	
	Person findById(Long pId);
}
