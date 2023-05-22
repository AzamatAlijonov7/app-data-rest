package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.appdatarest.entity.Product;
import uz.task.appdatarest.projection.ProductProjection;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<ProductProjection> findAllProjectedBy();
}

