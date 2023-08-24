package com.mavlsoft.springbootjsf.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PRODUCTS")
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Products implements Serializable {

    private static final long serialVersionUID = 7780911593593884637L;
    @Column(name = "BRANDID")
    private Long brandId;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTS_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_PRODUCTS", allocationSize = 1, name = "PRODUCTS_SEQ")
    @Column(name = "PRODUCTID")
    private Long productId;
    @Column(columnDefinition = "VARCHAR(256) default ''")
    private String product;
    @ColumnDefault(value = "0")
    private BigDecimal  price;
    @ColumnDefault(value = "0")
    private Integer quantity;
    @Column(columnDefinition = "VARCHAR(256) default ''")
    private String urlImage;

    public Products(String product, BigDecimal  price, Integer quantity, String urlImage) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.urlImage = urlImage;
    }

}
