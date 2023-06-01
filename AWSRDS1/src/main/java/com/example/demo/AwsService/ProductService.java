package com.example.demo.AwsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AwsRepository.ProductRepository;
import com.example.demo.AwsResource.Product;

@Service
public class ProductService {

	@Autowired

	ProductRepository productRepository;

	public Product add(Product product) { // boolean changed to Product

		Product productT = productRepository.save(product);

		return productT;

	}
}