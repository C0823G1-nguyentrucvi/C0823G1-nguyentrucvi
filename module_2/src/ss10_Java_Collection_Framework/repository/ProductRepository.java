package ss10_Java_Collection_Framework.repository;

import ss10_Java_Collection_Framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private List<Product> products = new ArrayList<>();


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void remove(String id) {
        for (Product product: products){
            if(product.getId().equals(id)){
                products.remove(product);
                break;
            }
        }
    }

}



