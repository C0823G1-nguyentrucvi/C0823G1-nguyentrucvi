package ss10_Java_Collection_Framework.controller;

import ss10_Java_Collection_Framework.model.Product;
import ss10_Java_Collection_Framework.sevice.IProductService;
import ss10_Java_Collection_Framework.sevice.ProductService;

import java.util.List;

public class ProductController {
private final IProductService iProductService= (IProductService) new ProductService();
public void addProduct(ProductController product){
    iProductService.save(product);
}

    public List<Product> getAll() {
    return iProductService.findAll();
    }
    public Product findByCode(String code){
    return iProductService.findByCode(code);
    }
    public void remove(String code){
    iProductService.remove(code);
    }
}
