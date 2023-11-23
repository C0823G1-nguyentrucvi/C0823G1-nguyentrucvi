package ss10_Java_Collection_Framework.controller;

import ss10_Java_Collection_Framework.model.Product;
import ss10_Java_Collection_Framework.sevice.IProductService;
import ss10_Java_Collection_Framework.sevice.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public void addProduct(Product product) {
        productService.save(product);
    }


    public List<Product> getAll() {
        return productService.findAll();
    }

    public Product findById(String id) {
        return productService.findById(id);
    }

    public void remove(String id) {
        productService.remove(id);
    }

    public boolean checkId(String id) {
         return productService.checkId(id);
    }

    public List<Product> comfirmId(String id1) {

        return productService.comfirmId(id1);
    }

    public void editName(String id1, String name) {
        productService.editName(id1,name);
    }

    public void editPrice(String id1, Double price) {
        productService.editPrice(id1, price);
    }
}


