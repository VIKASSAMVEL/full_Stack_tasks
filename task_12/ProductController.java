package com.college.task12;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private List<ProductDTO> products = new ArrayList<>();

    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return products;
    }

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO product) {
        products.add(product);
        return product;
    }

    @PutMapping("/{index}")
    public ProductDTO updateProduct(@PathVariable int index, @RequestBody ProductDTO product) {
        if (index >= 0 && index < products.size()) {
            products.set(index, product);
            return product;
        }
        return null;
    }

    @DeleteMapping("/{index}")
    public String deleteProduct(@PathVariable int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
            return "Product Deleted";
        }
        return "Product Not Found";
    }
}
