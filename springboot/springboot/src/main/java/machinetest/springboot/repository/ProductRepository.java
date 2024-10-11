package machinetest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import machinetest.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
