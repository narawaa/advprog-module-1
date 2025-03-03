package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List <Product> productData = new ArrayList<>();

    public Product create (Product product) {
        productData.add(product);
        return product;
    }
    
    public Product edit(Product product) {
        int counter = 0;
        for (Product p : productData) {
            if (p.getProductId().equals(product.getProductId())) {
                productData.set(counter, product);
                return product;
            }
            counter++;
        }
        return null;
    }

    public void delete (Product product) {
        productData.remove(product);
    }

    public Product getProductById(String productId) {
        for (Product product : productData) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public Iterator <Product> findAll() {
        return productData.iterator();
    }
}
