package com.optimisticchemicalmakers.mapfood.factories;

import com.optimisticchemicalmakers.mapfood.dtos.ProductDTO;
import com.optimisticchemicalmakers.mapfood.models.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductFactory {

    public ProductDTO getInstance(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setUuid(product.getUuid());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }
}

