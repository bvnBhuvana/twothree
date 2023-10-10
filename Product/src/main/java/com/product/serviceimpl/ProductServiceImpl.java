package com.product.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.product.DAO.ProductRepository;
import com.product.dto.ProductDto;
import com.product.entity.Product;

import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productDao;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDto saveProduct(ProductDto productDto) {
		Product product= modelMapper.map(productDto,Product.class);
		productDao.save(product);
		return productDto;
	}
	
	

}
