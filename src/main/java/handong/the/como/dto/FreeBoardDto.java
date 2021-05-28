package handong.the.como.dto;

import handong.the.como.domain.entity.FreeBoard;
import handong.the.como.domain.entity.User;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FreeBoardDto {
    private long id;
    private String title;
    private String content;
    private Timestamp write_at;
    private long like;
    private long dislike;
    private User user;

    public FreeBoard toEntity() {
        FreeBoard build = FreeBoard.builder()
                .id(id)
                .title(title)
                .content(content)
                .write_at(write_at)
                .like(like)
                .dislike(dislike)
                .user(user)
                .build();

        return build;
    }

    @Builder
    public FreeBoardDto(long id, String title, String content, Timestamp write_at, long like, long dislike, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.write_at = write_at;
        this.like = like;
        this.dislike = dislike;
        this.user = user;
    }
}
