package com.rentalhub.microservices.product_service.service;

import com.rentalhub.microservices.product_service.dto.ProductRequest;
import com.rentalhub.microservices.product_service.model.Product;
import com.rentalhub.microservices.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        log.info("Product created successfully");
        return product;
    }

    public List<Product> getAllProducts() {
        return null;
    }
}
