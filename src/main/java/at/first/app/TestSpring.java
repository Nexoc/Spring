package at.first.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*
        // todo my 1 lesson start
        // create connection to application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // ("Bean ID" in the applicationContext.xml, class in project)
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        // applicationContext should be closed
        context.close();
        // todo 2nd lesson start
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // ("Bean ID" in the applicationContext.xml, class in project)
        Music music= context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
        // todo 3rd lesson start
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
        // todo 4rd lesson
        //  scope="prototype" or "singleton"
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(comparison);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        context.close();
        // todo 5th lesson
        // init destroy
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBeanClassic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic2.getSong());
        // applicationContext should be closed
        context.close();
        // todo 6th lesson
        // Factory Method
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        context.close();
         */

        // todo 7th lesson
        // @Component -> through Annotations
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
       // if we don't write name of the component it will be named as Class name
       PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
       System.out.println(rockMusic.getSong());
       System.out.println(popMusic.getSong());

       context.close();











    }
}
