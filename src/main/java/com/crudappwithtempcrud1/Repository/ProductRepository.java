package com.crudappwithtempcrud1.Repository;


import com.crudappwithtempcrud1.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}