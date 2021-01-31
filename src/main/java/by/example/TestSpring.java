package by.example;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
               SpringConfig.class
       );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer3",MusicPlayer.class);
//        musicPlayer1.play();
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());

//        RapMusic rapMusic1 = context.getBean("musicBean2", RapMusic.class);
//        RapMusic rapMusic2 = context.getBean("musicBean2", RapMusic.class);
//        boolean isTheSame = rapMusic1 == rapMusic2;
//        System.out.println(isTheSame);
//        System.out.println(rapMusic1);
//        System.out.println(rapMusic2);
//
//        RockMusic rockMusic = context.getBean("musicBean1",RockMusic.class);
//        System.out.println(rockMusic.getSong());
//        context.close();
    }
}
