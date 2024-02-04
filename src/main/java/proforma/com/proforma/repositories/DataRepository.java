package proforma.com.proforma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import proforma.com.proforma.models.Data;

@Repository
public interface DataRepository extends JpaRepository<Data,Long> {
}
