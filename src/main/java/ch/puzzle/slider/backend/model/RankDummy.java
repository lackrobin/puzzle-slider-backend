package ch.puzzle.slider.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rlack on 13.10.16.
 */
@Entity
public class RankDummy {
    @Id
    private long id;
    private int rank;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
