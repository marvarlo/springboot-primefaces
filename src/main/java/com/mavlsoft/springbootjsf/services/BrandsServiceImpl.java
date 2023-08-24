package com.mavlsoft.springbootjsf.services;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import com.mavlsoft.springbootjsf.dao.BrandsDao;
import com.mavlsoft.springbootjsf.entities.Brands;
import jakarta.persistence.Id;

@Service
@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
public class BrandsServiceImpl implements BrandsService{
    private final static Logger LOG = LoggerFactory.getLogger(BrandsServiceImpl.class);
    @Autowired
    private BrandsDao dao;

    @Override
    public List<Brands> findAll() {
        return (List<Brands>) dao.findAll();
    }

    @Override
    public Optional<Brands> findById(Id id) {
        LOG.info("Finding brands by id={}", id);
        return dao.findById(id);
    }

    @Override
    public boolean existsById(Id id) {
        LOG.info("Search for brand by id={}", id);
        return dao.existsById(id);
    }

    @Override
    public Brands save(Brands entity) {
        LOG.info("Saving brand  = {}", entity);
        return dao.save(entity);
    }

    @Override
    public void deleteById(Id id) {
        LOG.info("Deleting brand id = {}", id);
        dao.deleteById(id);
    }

    @Override
    public void delete(Brands entity) {
        LOG.info("Deleting brand {}", entity);
        dao.delete(entity);
    }

    @Override
    public void deleteAll(List<Brands> selectedBrands) {
        LOG.info("Deleting brands {}", selectedBrands);
        dao.deleteAll(selectedBrands);
    }

}
