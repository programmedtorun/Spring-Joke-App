package patty.springframework.joke.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import patty.springframework.joke.jokeapp.services.JokeService;

/**
 * Created by patrickskelley on Apr, 2020
 * a comment
 */
@Controller
public class JokeController {


    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }



}
