package ro.ubb.istudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ro.ubb.istudent.domain.AssignmentEntity;

/**
 * Created by Cristina on 12/13/2017.
 */
public interface AssignmentRepository extends JpaRepository<AssignmentEntity, Long> {
}
