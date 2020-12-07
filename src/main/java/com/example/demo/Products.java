package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String product_name;
	private String product_quantity;
	private String product_price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(String product_quantity) {
		this.product_quantity = product_quantity;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", product_name=" + product_name + ", product_quantity=" + product_quantity
				+ ", product_price=" + product_price + "]";
	}
	
}
