package sosteam.deamhome.role_hierarchy_test.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sosteam.deamhome.role_hierarchy_test.entity.store;

@Repository
public interface StoreRepository extends JpaRepository<store, Long> {
}
