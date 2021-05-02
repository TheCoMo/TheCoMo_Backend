package handong.the.como.domain.entity;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Entity
@Table(name = "private_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PrivateUser {

    @Id @GeneratedValue
    private long id;

    @Column(length = 1, nullable = false)
    private AtomicInteger status;

    @Column(length = 255, nullable = false)
    private String studentEmail;

    @Column(nullable = false)
    private Timestamp register_at;

    @Column(nullable = true)
    private Timestamp quit_at;

    @Builder
    public PrivateUser(long id, AtomicInteger status, String studentEmail, Timestamp register_at, Timestamp quit_at) {
        this.id = id;
        this.status = status;
        this.studentEmail = studentEmail;
        this.register_at = register_at;
        this.quit_at = quit_at;
    }
}
