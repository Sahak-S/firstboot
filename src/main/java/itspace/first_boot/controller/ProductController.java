package itspace.first_boot.controller;

import itspace.first_boot.model.Product;
import itspace.first_boot.services.ProductServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private final ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("/products")
    public String viewProduct(Model model) {
        var products = productServices.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(
//            @RequestParam String name,
//            @RequestParam double price,
            Product product,
            Model model) {
//        Product product = new Product();
//        product.setName(name);
//        product.setPrice(price);
        productServices.addProduct(product);
//        var products = productServices.findAll();
//        model.addAttribute("products",products);
        viewProduct(model);
        return "products";
    }
}
