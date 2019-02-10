package com.optimisticchemicalmakers.mapfood.factories;

import org.springframework.stereotype.Component;

import com.optimisticchemicalmakers.mapfood.dtos.ProductDto;
import com.optimisticchemicalmakers.mapfood.models.Product;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductFactory {

    public ProductDto getInstance(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setProtocol(product.getProtocol());
        productDto.setPrice(product.getPrice());
        productDto.setDescription(product.getDescription());
        return productDto;
    }

    public Product getInstance(ProductDto productDto) {
        Product product = new Product();
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        return product;
    }

    public List<ProductDto> getListInstance(List<Product> products) {
        return products.stream().map(product -> getInstance(product)).collect(Collectors.toList());
    }


}
