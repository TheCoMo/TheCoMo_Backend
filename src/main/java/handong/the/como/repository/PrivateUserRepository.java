package handong.the.como.repository;

import handong.the.como.domain.entity.PrivateUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.concurrent.atomic.AtomicLong;


public interface PrivateUserRepository extends JpaRepository<PrivateUser, AtomicLong> {

}
