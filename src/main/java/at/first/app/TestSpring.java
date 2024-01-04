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
        // todo 1 lesson done
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // ("Bean ID" in the applicationContext.xml, class in project)
        Music music= context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        // applicationContext should be closed
        context.close();






    }
}
