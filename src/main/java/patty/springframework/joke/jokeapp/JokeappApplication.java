package patty.springframework.joke.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")  // needed for xml config of spring beans.
// comment this line and uncomment annotations within ChuckConfig to switch back to java configuration 
public class JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }

}
