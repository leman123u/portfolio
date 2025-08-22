package az.ingress.repository;

import az.ingress.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <ProjectEntity ,Long> {
}
