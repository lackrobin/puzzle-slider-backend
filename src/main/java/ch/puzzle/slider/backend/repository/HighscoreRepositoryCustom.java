package ch.puzzle.slider.backend.repository;

import ch.puzzle.slider.backend.model.Highscore;

import java.util.List;

public interface HighscoreRepositoryCustom {

    Highscore findHighscoreWithRank(long id);

    List<Highscore> findTopHighscores(int ctx);
}
