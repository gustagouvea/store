package com.example.springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CartProductsKey implements Serializable {
    @Column(name = "cart_id")
    Long cartId;

    @Column(name = "product_id")
    Long productId;
}
