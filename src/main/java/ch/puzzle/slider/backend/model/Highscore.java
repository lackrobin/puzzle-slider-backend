package ch.puzzle.slider.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Highscore {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private long time;


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "highscore")
//    private List<Move> moves;

    @Column(nullable = false)
    private int score;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;


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

//    public List<Move> getMoves() {
//        return moves;
//    }
//
//    public void setMoves(List<Move> moves) {
//        this.moves = moves;
//    }

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
}
