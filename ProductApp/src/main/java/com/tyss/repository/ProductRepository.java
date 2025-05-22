package com.tyss.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tyss.entity.Product;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Page<Product> findByPriceIsLessThanEqual(@Param("price") Double price, Pageable pageable);

	Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
