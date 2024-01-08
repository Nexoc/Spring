package at.first.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("at.first.app")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    //Bean
    // public ClassicalMusic classicalMusic() {
    // return new ClassicalMusic();
    // }
}
