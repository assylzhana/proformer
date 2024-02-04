package proforma.com.proforma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proforma.com.proforma.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
