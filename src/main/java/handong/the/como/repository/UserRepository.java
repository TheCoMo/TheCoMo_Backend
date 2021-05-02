package handong.the.como.repository;

import handong.the.como.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.concurrent.atomic.AtomicLong;

public interface UserRepository extends JpaRepository<User, AtomicLong> {

}
