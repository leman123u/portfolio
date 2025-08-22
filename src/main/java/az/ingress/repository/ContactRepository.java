package az.ingress.repository;

import az.ingress.entity.ContactEntity;
import az.ingress.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity,Long> {
}
