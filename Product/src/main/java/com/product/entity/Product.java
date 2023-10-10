package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;
	private String bugs;
	

}
