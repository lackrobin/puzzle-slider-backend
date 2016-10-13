package ch.puzzle.slider.backend.controller;

import ch.puzzle.slider.backend.model.Highscore;
import ch.puzzle.slider.backend.repository.HighscoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rlack on 22.09.16.
 */
@RestController
@RequestMapping("/api/highscores")
public class HighscoreController {
    @Autowired
    protected HighscoreRepository repository;

    @RequestMapping(value = "",
            method = RequestMethod.GET)
    public Iterable<Highscore> getHighscores() {
        return repository.findAll();
    }

    @RequestMapping(value = "/rank/top/{ctx}",
            method = RequestMethod.GET)
    public Iterable<Highscore> getTopHighscores(@PathVariable int ctx) {
        return repository.findTopHighscores(ctx);

    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET)
    public Highscore getHighscore(@PathVariable long id) {
        return repository.findOne(id);
    }


    @RequestMapping(value = "/rank/{id}",
            method = RequestMethod.GET)
    public Highscore getRank(@PathVariable long id) {
        return repository.findHighscoreWithRank(id);
    }


    @RequestMapping(
            value = "",
            method = RequestMethod.POST)
    @ResponseBody
    public Highscore createHighscore(@RequestBody Highscore highscore) {
        return repository.save(highscore);
    }


}
