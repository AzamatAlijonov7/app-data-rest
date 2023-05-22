package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.appdatarest.projection.SupplierWithIdProjection;

import java.util.List;
import java.util.function.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    List<SupplierWithIdProjection> findAllProjectedBy();

}

