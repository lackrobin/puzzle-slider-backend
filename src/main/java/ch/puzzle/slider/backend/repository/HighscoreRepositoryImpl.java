package ch.puzzle.slider.backend.repository;

import ch.puzzle.slider.backend.model.Highscore;
import ch.puzzle.slider.backend.model.RankDummy;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rlack on 28.09.16.
 */
public class HighscoreRepositoryImpl implements HighscoreRepositoryCustom {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Highscore> findTopHighscores(int ctx) {
        Query queryRank = em.createNativeQuery("SELECT id, FIND_IN_SET( timecount, (\n" +
                "SELECT GROUP_CONCAT( timecount\n" +
                "ORDER BY timecount ASC ) \n" +
                "FROM highscore )\n" +
                ") AS rank\n" +
                "FROM highscore LIMIT :ctx", RankDummy.class);
        queryRank.setParameter("ctx", ctx);
        return getHighscores(queryRank);
    }

    public Highscore findHighscoreWithRank(long id) {
        Query queryRank = em.createNativeQuery("SELECT id, FIND_IN_SET( timecount, (\n" +
                "SELECT GROUP_CONCAT( timecount\n" +
                "ORDER BY timecount ASC ) \n" +
                "FROM highscore )\n" +
                ") AS rank\n" +
                "FROM highscore WHERE id = :id", RankDummy.class);
        queryRank.setParameter("id", id);
        Highscore highscore = em.find(Highscore.class, id);
        RankDummy dummy = (RankDummy) queryRank.getSingleResult();
        highscore.setRank(dummy.getRank());
        return highscore;
    }

    public Highscore findHighscoreAbove(long id) {
//        Highscore highscore = findHighscoreWithRank(id);
//        Query queryRank = em.createNativeQuery("SELECT x.id FROM (SELECT id, FIND_IN_SET( timecount, (\n" +
//                "SELECT GROUP_CONCAT( timecount\n" +
//                "ORDER BY timecount ASC )\n" +
//                "FROM highscore)\n" +
//                ") AS rank \n" +
//                "FROM highscore ) AS x WHERE x.rank =   :rank", RankDummy.class);
//        if (highscore.getRank() > 3) {
//            queryRank.setParameter("rank", highscore.getRank() - 1);
//            return getHighscores(queryRank).get(0);
//        }
        return null;
    }


    private List<Highscore> getHighscores(Query queryRank) {
        List<Highscore> highscores = new ArrayList();
        List<RankDummy> rankRes = queryRank.getResultList();
        for (RankDummy r : rankRes) {
            //TODO There might be a better solution than calling the em  in a loop
            Highscore h = em.find(Highscore.class, r.getId());
            h.setRank(r.getRank());
            highscores.add(h);
        }
        return highscores;
    }

}
