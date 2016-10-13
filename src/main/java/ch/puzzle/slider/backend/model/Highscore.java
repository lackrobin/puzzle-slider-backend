package ch.puzzle.slider.backend.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(
        name = "highscore", indexes = {
        @Index(columnList = "score", name = "score_idx")
}
)
public class Highscore {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private long time;


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "highscore_fk")
    private List<Move> moves;

    @Column(nullable = false)
    private int score;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Transient
    private int rank;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public long getId() {
        return id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
