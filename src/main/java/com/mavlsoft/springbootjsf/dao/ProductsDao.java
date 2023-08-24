package com.mavlsoft.springbootjsf.dao;

import com.mavlsoft.springbootjsf.entities.Products;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface ProductsDao extends CrudRepository<Products, Id> {

}
