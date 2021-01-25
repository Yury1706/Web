package by.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//
//        System.out.println(testBean.getName());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        musicPlayer.play();

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer3",MusicPlayer.class);
        musicPlayer1.play();
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
