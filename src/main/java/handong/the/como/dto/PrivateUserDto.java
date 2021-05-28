package handong.the.como.dto;

import handong.the.como.domain.entity.PrivateUser;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PrivateUserDto {
    private long id;
    private int status;
    private String studentEmail;
    private Timestamp register_at;
    private Timestamp quit_at;

    public PrivateUser toEntity() {
        PrivateUser build = PrivateUser.builder()
                .id(id)
                .status(status)
                .studentEmail(studentEmail)
                .register_at(register_at)
                .quit_at(quit_at)
                .build();

        return build;
    }

    @Builder
    public PrivateUserDto(long id, int status, String studentEmail, Timestamp register_at, Timestamp quit_at) {
        this.id = id;
        this.status = status;
        this.studentEmail = studentEmail;
        this.register_at = register_at;
        this.quit_at = quit_at;
    }
}
