package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.task.appdatarest.entity.InputProduct;
import uz.task.appdatarest.projection.InputProductProjection;

import java.util.List;

public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
    List<InputProductProjection> findAllProjectedBy();
}
