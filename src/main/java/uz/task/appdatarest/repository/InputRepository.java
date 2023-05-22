package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.appdatarest.entity.Input;
import uz.task.appdatarest.projection.InputProjection;

import java.util.List;

@Repository
public interface InputRepository extends JpaRepository<Input, Long> {

    List<InputProjection> findAllProjectedBy();

}

