package ss10_Java_Collection_Framework.sevice;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;
import ss10_Java_Collection_Framework.repository.IProductRepository;
import ss10_Java_Collection_Framework.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private final IProductRepository iProductRepository  = new ProductRepository();

    @Override
    public void save(ProductController product) {

    }

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Product findByCode(String code) {
        return this.iProductRepository.findByCode(code);
    }

    @Override
    public void remove(String code) {

    }
}
