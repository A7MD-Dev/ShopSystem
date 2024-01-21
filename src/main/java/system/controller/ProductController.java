package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.ProductNotFoundException;
import system.model.Product;
import system.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> getAllProducts() {
        try {
            return productService.getAllProducts();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Products", e);
        }
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id)  {
        return productService.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
    }

}
