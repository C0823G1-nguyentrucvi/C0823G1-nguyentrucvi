package ss16_binaryFile.service;

import ss16_binaryFile.models.Product;
import ss16_binaryFile.repository.IProductRepository;
import ss16_binaryFile.repository.ProductRepository;

import java.util.List;

public class ProductSevice implements IProductSevice {
    private IProductRepository iProductRepository = new ProductRepository();


    @Override
    public void findAll() {
        iProductRepository.findAll();
    }

    @Override
    public List<Product> getAll() {
        return iProductRepository.getAll();
    }

    @Override
    public List<Product> findProductsByName(String name) {
        return this.iProductRepository.findProductsByName(name);
    }

    @Override
    public void addProduct(Product product) {
        this.iProductRepository.addProduct(product);
    }
}
