package ss10_Java_Collection_Framework.sevice;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;
import ss10_Java_Collection_Framework.repository.IProductRepository;
import ss10_Java_Collection_Framework.repository.ProductRepository;
import ss7_mvc.service.StudentService;

import java.util.List;

public class ProductService implements IProductService {
private IProductRepository productRepository=new ProductRepository();
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(String id) {
        productRepository.remove(id);
    }
}
