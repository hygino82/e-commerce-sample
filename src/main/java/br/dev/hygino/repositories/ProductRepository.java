package br.dev.hygino.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.hygino.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryName(String categoryName);

    List<Product> findByBrand(String brand);

    List<Product> findByCategoryNameAndBrand(String categoryName, String brand);

    List<Product> findByName(String name);

    List<Product> findByBrandAndName(String brand, String name);
    
}
