package system.service;

import org.springframework.stereotype.Service;
import system.model.Product;
import system.model.repository.ProductRepository;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createUser(Product role) {
        return productRepository.save(role);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product updateCategory(Product role) {
        return productRepository.save(role);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
