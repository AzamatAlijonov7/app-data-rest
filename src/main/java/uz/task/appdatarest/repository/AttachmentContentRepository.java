package uz.task.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.task.appdatarest.entity.Attachment;
import uz.task.appdatarest.projection.AttachmentProjection;

import java.util.List;

public interface AttachmentContentRepository extends JpaRepository<Attachment, Long> {
    @Query("SELECT a.id as id, a.name as name, ac.id as contents_id, ac.content as contents_content FROM Attachment a JOIN a.contents ac")
    List<AttachmentProjection> findAllData();
}

