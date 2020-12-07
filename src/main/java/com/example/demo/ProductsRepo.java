package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProductsRepo extends JpaRepository<Products, Long>{
	
	@Query(value = "select * from Products where id=?1",nativeQuery = true)
	List<Products> findbyid(long id);

}
