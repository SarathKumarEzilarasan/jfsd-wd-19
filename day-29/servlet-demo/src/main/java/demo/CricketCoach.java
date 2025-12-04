package demo;

public class CricketCoach implements Coach {
    private WishService wishService;
    private String email;

//    public CricketCoach(WishService wishService) {
//        this.wishService = wishService;
//    }

    public void setWishService(WishService wishService) {
        this.wishService = wishService;
    }

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

    public void startupMethod() {
        System.out.println("started");
    }

    public void destroyMethod() {
        System.out.println("destroyed");
    }
}
