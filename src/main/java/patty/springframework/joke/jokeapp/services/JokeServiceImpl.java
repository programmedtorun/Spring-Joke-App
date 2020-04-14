package patty.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Service
public class JokeServiceImpl implements JokeService {

    // final var can not be changed and is initialized in constructor
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // need to add ChuckConfig class with @Configuration annotation and
    // then add method that return new ChuckNorrisQuotes instance so that
    // it is available in the Spring context and can be used in constructor here:
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    //    public JokeServiceImpl() {
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
