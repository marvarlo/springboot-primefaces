package com.mavlsoft.springbootjsf.services;

import java.util.List;
import java.util.Optional;
import com.mavlsoft.springbootjsf.entities.Products;
import jakarta.persistence.Id;


public interface ProductsService {

    List<Products> findAll();

    Optional<Products> findById(Id id);

    List<Products> findAll(List<Id> ids);

    Products save(Products product);

    void deleteById(Id id);

    void delete(Products product);

}
