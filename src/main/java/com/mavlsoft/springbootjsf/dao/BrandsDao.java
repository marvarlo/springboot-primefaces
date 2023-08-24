package com.mavlsoft.springbootjsf.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.mavlsoft.springbootjsf.entities.Brands;
import jakarta.persistence.Id;

public interface BrandsDao extends CrudRepository<Brands, Id> {
    /**
     * Find Brand that for ID and active.
     * @param id
     * @return
     */
    public Optional<Brands> findBybrandIdAndActiveTrue(Long id);

    /**
     * Find All active Brands.
     * @return
     */
    public List<Brands> findByActiveTrue();
}
