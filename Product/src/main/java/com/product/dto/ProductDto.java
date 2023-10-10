package com.product.dto;

import lombok.Data;

@Data
public class ProductDto {
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;
	private String bugs;

}
