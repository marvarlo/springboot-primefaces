package com.mavlsoft.springbootjsf.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "BRANDS")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Brands implements Serializable {

    private static final long serialVersionUID = -8677289540561900691L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BRAND_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_BRANDS", allocationSize = 1, name = "BRAND_SEQ")
    @Column(name = "BRANDID")
    private Long brandId;
    private String brand;
    private String imagePath;
    private Boolean active = Boolean.TRUE;
    @Transient
    private List<Products> lstProducts;

    Brands(String brand, Boolean active, String imagePath) {
        this.brand = brand;
        this.active = active;
        this.imagePath = imagePath;
    }
}
