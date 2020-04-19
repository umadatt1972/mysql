import org.springframework.data.jpa.repository.JpaRepository;

import io.uma.springbootmysql.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
User findByUsername(String userName);
}
