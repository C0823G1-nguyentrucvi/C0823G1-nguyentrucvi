package ss10_Java_Collection_Framework.repository;

import ss10_Java_Collection_Framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Iphone",230000));
        products.add(new Product(2,"SamSung",20000));
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findByCode(String code) {
        return null;
    }

    @Override
    public void remove(String code) {

    }
}



