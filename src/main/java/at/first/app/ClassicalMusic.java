package at.first.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic() {};

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory Method");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>(3);
        songs.add("1 Cl");
        songs.add("2 Cl");
        songs.add("3 Cl");
        return songs;
    }
}
