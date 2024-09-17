package itspace.first_boot.services;

import itspace.first_boot.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public List<Product> findAll(){
        return products;
    }
}
