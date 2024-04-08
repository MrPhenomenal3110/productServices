package org.premshah.productservices.Services;

import org.premshah.productservices.Models.Category;
import org.premshah.productservices.Models.Product;
import java.util.List;

public interface ProductServices {
    List<Product> getAllProducts();
    Product getProductById(int id);
    List<Product> getProductsByCategory(String category);
    List<Category> getAllCategories();
    Product createProduct(Product product);
    String updateProduct(int id, Product product);
    String deleteProduct(int id);
}
