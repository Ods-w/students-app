package net.studentsapp.repository;

import net.studentsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {


}
