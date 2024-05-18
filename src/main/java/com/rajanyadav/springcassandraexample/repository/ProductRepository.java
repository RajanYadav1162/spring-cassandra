package com.rajanyadav.springcassandraexample.repository;

import com.rajanyadav.springcassandraexample.model.Product;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, UUID> {

}
