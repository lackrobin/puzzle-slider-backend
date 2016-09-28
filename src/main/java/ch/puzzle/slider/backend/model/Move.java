package ch.puzzle.slider.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rlack on 22.09.16.
 */
@Entity
public class Move {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private int xStart;

    @Column(nullable = false)
    private int yStart;

    @Column(nullable = false)
    private int xEnd;

    @Column(nullable = false)
    private int yEnd;


    @Column(nullable = false)
    private long time;

    public int getId() {
        return id;
    }

    public int getxStart() {
        return xStart;
    }

    public void setxStart(int xStart) {
        this.xStart = xStart;
    }

    public int getyStart() {
        return yStart;
    }

    public void setyStart(int yStart) {
        this.yStart = yStart;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }
}
