package ua.dtsebulia.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.dtsebulia.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
