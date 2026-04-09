package com.example.fsadexperiment8;

import com.example.fsadexperiment8.model.Product;
import com.example.fsadexperiment8.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("Laptop", "Electronics", 1200.00));
        productRepository.save(new Product("Phone", "Electronics", 800.00));
        productRepository.save(new Product("Shirt", "Clothing", 50.00));
        productRepository.save(new Product("Pants", "Clothing", 70.00));
        productRepository.save(new Product("Book", "Books", 20.00));
        productRepository.save(new Product("Tablet", "Electronics", 600.00));
    }
}
