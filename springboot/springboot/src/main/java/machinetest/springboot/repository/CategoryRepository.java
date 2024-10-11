package machinetest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import machinetest.springboot.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
