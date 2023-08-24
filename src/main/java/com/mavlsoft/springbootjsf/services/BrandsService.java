package com.mavlsoft.springbootjsf.services;

import java.util.List;
import java.util.Optional;
import com.mavlsoft.springbootjsf.entities.Brands;
import jakarta.persistence.Id;


public interface BrandsService {

    List<Brands> findAll();

    Optional<Brands> findById(Id id);

    boolean existsById(Id id);

    Brands save(Brands entity);

    void deleteById(Id id);

    void delete(Brands entity);

    void deleteAll(List<Brands> selectedBrands);

}
