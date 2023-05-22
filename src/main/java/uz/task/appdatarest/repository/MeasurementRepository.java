package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.task.appdatarest.entity.Measurement;
import uz.task.appdatarest.projection.MeasurementProjection;

import java.util.List;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

    @Query("SELECT m.id as id, m.name as name, m.active as active FROM Measurement m")
    List<MeasurementProjection> findMeasurementData();

}

