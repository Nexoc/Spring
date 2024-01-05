package at.first.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music musicClassic;
    private  Music musicPop;
    private  Music musicRock;

    Random random = new Random();

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("popMusic") Music music2,
                       @Qualifier("musicBeanRock") Music music3) {
        this.musicClassic = music1;
        this.musicPop = music2;
        this.musicRock = music3;
    }


    public String playMusic(MusicGenre musicGenre) {
        int index = random.nextInt(3);
        if (musicGenre == MusicGenre.ROCK) {
        return "Playing: " + musicRock.getSong().get(index);
        } else if (musicGenre == MusicGenre.CLASSICAL) {
            return "Playing: " + musicClassic.getSong().get(index);
        } else {
            return "Playing: " + musicPop.getSong().get(index);
        }
    }
}
