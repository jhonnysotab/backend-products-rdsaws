package com.jhonnys.backend.backendproducts.repositories;

import org.springframework.data.annotation.AccessType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jhonnys.backend.backendproducts.entities.Products;
 
@CrossOrigin(originPatterns = "http://localhost:5173/")
@RepositoryRestResource(path = "products")
public interface ProductsRepository extends CrudRepository<Products, Long> {



}
