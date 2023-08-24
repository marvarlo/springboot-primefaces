package com.mavlsoft.springbootjsf.services;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import com.mavlsoft.springbootjsf.dao.ProductsDao;
import com.mavlsoft.springbootjsf.entities.Products;
import jakarta.persistence.Id;

@Service
@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
public class ProductsServiceImpl implements ProductsService {
    private final static Logger LOG = LoggerFactory.getLogger(ProductsServiceImpl.class);

    @Autowired
    private ProductsDao dao;

    @Override
    public List<Products> findAll() {
        LOG.info("Finding all products...");
        return (List<Products>) dao.findAll();
    }

    @Override
    public Optional<Products> findById(Id id) {
        LOG.info("Finding product id = {}", id);
        return dao.findById(id);
    }

    @Override
    public List<Products> findAll(List<Id> ids) {
        LOG.info("Finding products = {}", ids);
        return (List<Products>) dao.findAllById(ids);
    }

    @Override
    public Products save(Products product) {
        LOG.info("Saving product = {}", product);
        return dao.save(product);
    }

    @Override
    public void deleteById(Id id) {
        LOG.info("Deleting product id = {}", id);
        dao.deleteById(id);
    }

    @Override
    public void delete(Products product) {
        LOG.info("Deleting product: = {}", product);
        dao.delete(product);
    }
}
