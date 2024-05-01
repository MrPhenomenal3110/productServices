package org.premshah.productservices.Services;

import org.premshah.productservices.Exceptions.ProductNotFoundException;
import org.premshah.productservices.Models.Category;
import org.premshah.productservices.Models.Product;
import org.premshah.productservices.Repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public class SelfProductService implements ProductServices {

    ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById((long) id);
        return (product.orElseThrow(() -> new ProductNotFoundException(id,"Product not found")));
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        // TODO: Implement this method
        // This method should be in a different service class (CategoryService)
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        // TODO: Implement this method
        // This method should be in a different service class (CategoryService)
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        // TODO: Implement this method
        return null;
    }

    @Override
    public String updateProduct(int id, Product product) {
        // TODO: Implement this method
        return null;
    }

    @Override
    public String deleteProduct(int id) {
        // TODO: Implement this method
        return null;
    }
}
