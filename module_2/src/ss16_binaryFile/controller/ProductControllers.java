package ss16_binaryFile.controller;


import ss16_binaryFile.service.IProductSevice;
import ss16_binaryFile.service.ProductSevice;
import ss16_binaryFile.models.Product;

import java.util.List;

public class ProductControllers {
    private IProductSevice iProductSevice = new ProductSevice();

    public void addProduct(Product product) {
        iProductSevice.addProduct(product);
    }

    public List<Product> getAll() {
        return iProductSevice.getAll();
    }

    public List<Product> findProductsByName(String name) {
        List<Product> products = this.iProductSevice.findProductsByName(name);
        return products;
    }
}
