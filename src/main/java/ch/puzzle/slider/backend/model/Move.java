package ch.puzzle.slider.backend.model;

/**
 * Created by rlack on 22.09.16.
 */
//@Entity
public class Move {
    //    @Id
//    @GeneratedValue
    private int id;

    //    @Column(nullable = false)
    private int xAxis;

    //    @Column(nullable = false)
    private int yAxis;

    //    @Column(nullable = false)
    private long time;

    //    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "move_fk")
    private Highscore highscore;

    public int getId() {
        return id;
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Highscore getHighscore() {
        return highscore;
    }

    public void setHighscore(Highscore highscore) {
        this.highscore = highscore;
    }
}
