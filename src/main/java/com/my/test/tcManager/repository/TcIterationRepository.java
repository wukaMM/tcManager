package com.my.test.tcManager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.my.test.tcManager.model.Product;
import com.my.test.tcManager.model.TcIteration;

@Repository
public interface TcIterationRepository extends CrudRepository<TcIteration, Long> {
	
	TcIteration findById(Long tId);
	
	List<TcIteration> findByProduct(Product product);
}
