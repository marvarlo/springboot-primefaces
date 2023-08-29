package com.mavlsoft.springbootjsf.backendBeans;

import java.io.Serializable;
import java.util.List;

import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mavlsoft.springbootjsf.entities.Brands;
import com.mavlsoft.springbootjsf.services.BrandsService;
import com.mavlsoft.springbootjsf.utils.Functions;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "brandsBean")
@ViewScoped
public class BrandsBackendBean implements Serializable, BackEndBean<Brands>{

    private static final long serialVersionUID = 5943042583774348580L;
    private final static Logger LOG = LoggerFactory.getLogger(BrandsBackendBean.class);

    @Autowired
    private BrandsService service;
    @Getter @Setter
    private Brands currBrand;
    @Getter @Setter
    private List<Brands> brandList;
    @Getter @Setter
    private List<Brands> selectedBrands;

    @PostConstruct
    public void init() {
        LOG.info("Initializing BrandsController...");
        this.brandList = service.findAll();
    }

//    public BrandsBackendBean(@Autowired BrandsService service) {
//        LOG.info("Constructor BrandsController...");
//        this.brandList = service.findAll();
//    }

    @Override
    public void newItem() {
        LOG.info("Creating new brand...");
        this.currBrand = new Brands();
    }

    @Override
    public void save() {
        LOG.info("Entering to save Brand => {}", this.currBrand);
        String message;
        if(this.currBrand.getBrandId() == null) {
            message = String.format("New brand %s Added", this.currBrand.getBrand());
        } else {
            message = String.format("The brand %s was modified", this.currBrand.getBrand());
        }
        this.currBrand = service.save(this.currBrand);
        this.brandList = service.findAll();
        this.currBrand = null;
        Functions.addInfoMessage("Brands", message);
        PrimeFaces.current().executeScript("PF('manageDialog').hide()");
        PrimeFaces.current().ajax().update(getFormGlowId(), getFormDataTableName());
    }

    @Override
    public void delete() {
        LOG.info("Entering to delete brand => {}", this.currBrand);
        service.delete(this.currBrand);
        this.currBrand = null;
        this.brandList = service.findAll();
        Functions.addInfoMessage("Brands", "Brand Removed");
        PrimeFaces.current().ajax().update(getFormGlowId(), getFormDataTableName());
        PrimeFaces.current().executeScript(String.format("PF('%s').clearFilters()", getDataTableWidget()));
    }

    @Override
    public boolean hasSelectedItems() {
        return this.selectedBrands != null && !this.selectedBrands.isEmpty();
    }

    @Override
    public String getDeleteButtonMessage() {
        String message = "Delete";
        if (hasSelectedItems()) {
            int size = this.selectedBrands.size();
            message = String.format("Delete %s %s",size, (size > 1 ? "brands" : "brand"));
        }
        return message;
    }

    @Override
    public void deleteSelectedItems() {
        service.deleteAll(this.selectedBrands);
        this.selectedBrands = null;
        brandList = service.findAll();
        Functions.addInfoMessage("Brands", "Brands Removed");
        PrimeFaces.current().ajax().update(getFormGlowId(), getFormDataTableName());
        PrimeFaces.current().executeScript(String.format("PF('%s').clearFilters()", getDataTableWidget()));
    }

    @Override
    public String getDataTableName() {
        return "dt-brands";
    }

    @Override
    public String getDataTableWidget() {
        return "dtBrands";
    }

    @Override
    public String getFormName() {
        return "frmBrands";
    }

    @Override
    public String getDeleteButton() {
        return "delete-brands-button";
    }

    @Override
    public String getFormDeleteButton() {
        return String.format(":%s:%s", getFormName(), getDeleteButton());
    }

    @Override
    public String getGrowlId() {
        return "messages";
    }

    private String getFormGlowId() {
        return String.join(":", getFormName(), getGrowlId());
    }

    private String getFormDataTableName() {
        return String.join(":", getFormName(), getDataTableName());
    }

}
