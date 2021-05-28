package handong.the.como.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Builder
@Table(name = "free_board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FreeBoard {

    @Id @GeneratedValue
    private long id;

    @Column(length = 255, nullable = false)
    private String title;

    @Column(length = 255, nullable = false)
    private String content;

    @Column
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column
    private Timestamp write_at;

    @Column
    private long like;

    @Column
    private  long dislike;

    @Builder
    public FreeBoard(long id, String title, String content, User user, Timestamp write_at, long like, long dislike) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.write_at = write_at;
        this.like = like;
        this.dislike = dislike;
    }
}
