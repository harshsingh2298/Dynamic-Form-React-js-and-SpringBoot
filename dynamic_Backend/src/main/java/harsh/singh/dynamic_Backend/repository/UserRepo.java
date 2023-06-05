package harsh.singh.dynamic_Backend.repository;

import harsh.singh.dynamic_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
    
}
