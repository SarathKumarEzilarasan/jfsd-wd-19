package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

//        CricketCoach coach = new CricketCoach();
//        FootballCoach coach = new FootballCoach();

//        Coach coach = new CricketCoach(new HappyWishService());
//        System.out.println(coach.getDailyWorkOut());


//        ClassPathXmlApplicationContext context
//                = new ClassPathXmlApplicationContext("config.xml");
//        Coach coach = context.getBean("myCricketCoach", Coach.class);
//        System.out.println(coach.getDailyWorkOut());
//        System.out.println(coach.getDailyWish());
//        context.close();


//
//        ClassPathXmlApplicationContext context
//                = new ClassPathXmlApplicationContext("config.xml");
//        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
//        System.out.println(coach.getDailyWorkOut());
//        System.out.println(coach.getDailyWish());
//        System.out.println(coach.getEmail());
//        context.close();


        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("config.xml");
        CricketCoach coach1 = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(coach1);
        context.close();
    }
}
