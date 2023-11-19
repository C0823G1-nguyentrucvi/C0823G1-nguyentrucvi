package ss10_Java_Collection_Framework.sevice;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public class ProductService implements IProductService {

    @Override
    public void save(ProductController product) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findByCode(String code) {
        return null;
    }

    @Override
    public void remove(String code) {

    }
}
