package uz.task.appdatarest.repository;

import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.appdatarest.projection.CategoryProjection;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    public List<CategoryProjection> findAllProjectedBy();

}

