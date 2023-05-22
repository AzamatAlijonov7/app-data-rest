package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.appdatarest.entity.Warehouse;
import uz.task.appdatarest.projection.WarehouseProjection;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {

    List<WarehouseProjection> findAllProjectedById();
    WarehouseProjection findProjectedById(Long id);

}

