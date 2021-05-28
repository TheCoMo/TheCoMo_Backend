package handong.the.como.repository;

import handong.the.como.domain.entity.FreeBoard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.concurrent.atomic.AtomicLong;


public interface FreeBoardRepository extends JpaRepository<FreeBoard, AtomicLong> {
}
