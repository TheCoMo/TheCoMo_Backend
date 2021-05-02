package handong.the.como.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 255, nullable = false)
    private String email;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(length = 10, nullable = false)
    private String nickname;

    @Column(length = 60, nullable = false)
    private String depart;

    @Builder
    public User(long id, String email, String password, String nickname, String depart) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.depart = depart;
    }
}
