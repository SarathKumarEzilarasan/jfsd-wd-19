package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class CricketCoach implements Coach {
    private WishService wishService;
    @Value("${email}")
    private String email;

    @Autowired
    public CricketCoach(@Qualifier("happyWishService") WishService wishService) {
        this.wishService = wishService;
    }

//    public void setWishService(WishService wishService) {
//        this.wishService = wishService;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDailyWorkOut() {
        return "Spend 30 mins batting practice";
    }

    @Override
    public String getDailyWish() {
        return wishService.getWish();
    }

    @PostConstruct
    public void startupMethod() {
        System.out.println("started");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroyed");
    }
}
