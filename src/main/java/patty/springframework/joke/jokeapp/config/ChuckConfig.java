package patty.springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Configuration
public class ChuckConfig {

    // here we are using a "java configuration" because the class is
    // coming from an external JAR.
    // will be used when dealing with external JARs from an open source
    // project, or from another team. so u bring in another dependency
    // but you want to utilize the dependency in your app. 
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
