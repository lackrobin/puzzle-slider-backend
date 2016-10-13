package ch.puzzle.slider.backend.repository;

import ch.puzzle.slider.backend.model.Highscore;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by rlack on 22.09.16.
 */
public interface HighscoreRepository extends JpaRepository<Highscore, Long>, HighscoreRepositoryCustom {
}
