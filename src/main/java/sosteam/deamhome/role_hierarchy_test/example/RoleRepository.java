package sosteam.deamhome.role_hierarchy_test.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sosteam.deamhome.role_hierarchy_test.entity.role;

@Repository
public interface RoleRepository extends JpaRepository<role, Long> {
}
