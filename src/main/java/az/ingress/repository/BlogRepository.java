package az.ingress.repository;

import az.ingress.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity,Long > {
}
