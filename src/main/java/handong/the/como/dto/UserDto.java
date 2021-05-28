package handong.the.como.dto;

import handong.the.como.domain.entity.User;
import lombok.*;

import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private long id;
    private String email;
    private String password;
    private String nickname;
    private String depart;

    public User toEntity() {
        User build = User.builder()
                .id(id)
                .email(email)
                .password(password)
                .nickname(nickname)
                .depart(depart)
                .build();

        return build;
    }

    @Builder
    public UserDto(long id, String email, String password, String nickname, String depart) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.depart = depart;
    }
}
