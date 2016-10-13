package ch.puzzle.slider.backend.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(
        name = "highscore", indexes = {
        @Index(columnList = "timecount", name = "timecount_idx")
}
)
public class Highscore {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private long timecount;


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "highscore_fk")
    private List<Move> moves;


    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Transient
    private int rank;

    public long getId() {
        return id;
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

    public long getTimecount() {
        return timecount;
    }

    public void setTimecount(long timecount) {
        this.timecount = timecount;
    }
}
