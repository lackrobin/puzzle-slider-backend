package ch.puzzle.slider.backend.repository;

import ch.puzzle.slider.backend.model.Highscore;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Created by rlack on 22.09.16.
 */
public interface HighscoreRepository extends PagingAndSortingRepository<Highscore, Long> {

//    public List<Highscore> findHighscoreInContext(long highscoreId, int above, int below) {
//        return null;
//    }
}