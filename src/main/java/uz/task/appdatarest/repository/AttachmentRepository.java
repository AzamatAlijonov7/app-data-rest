package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.task.appdatarest.entity.Attachment;
import uz.task.appdatarest.projection.AttachmentProjection;

import java.util.List;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
    @Query("SELECT a.id as id, a.name as name, a.size as size, a.content_type as content_type FROM Attachment a")
    List<AttachmentProjection> findAllWithId();
}

