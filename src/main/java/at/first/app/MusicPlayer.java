package at.first.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    // @Autowired
    //private Music music;

    private  ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    /*
    @Autowired
    public MusicPlayer(Music music) {this.music = music;}
     */

    /*@Autowired
    public void setMusic(Music music) {
        this.music = music;
    }     */

    public String  playMusic () {  return "Playing: " + classicalMusic.getSong() +
             " and " + rockMusic.getSong();
    }

}
