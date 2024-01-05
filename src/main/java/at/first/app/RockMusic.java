package at.first.app;

import org.springframework.stereotype.Component;

@Component("musicBeanRock")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
