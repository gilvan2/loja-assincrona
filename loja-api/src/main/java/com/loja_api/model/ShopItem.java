package com.loja_api.model;

import	lombok.Getter;
import	lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity(name	=	"shop_item")
public class ShopItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private	Long id;
    @Column(name	=	"product_identifier")
    private	String	productIdentifier;

    private	Integer amount;
    private	Float price;
    @ManyToOne
    @JoinColumn(name = "shop_id")
    private	Shop shop;

}