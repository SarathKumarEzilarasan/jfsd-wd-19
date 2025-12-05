package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SportsConfig.class);
        CricketCoach coach1 = context.getBean("cricketCoach", CricketCoach.class);
//        System.out.println(coach1.getDailyWorkOut());
//        System.out.println(coach1.getDailyWish());
//        System.out.println(coach1.getEmail());

        System.out.println(coach1);
        ArrayList arrayList = context.getBean("arrayList", ArrayList.class);
        System.out.println(arrayList);
        context.close();


    }
}
