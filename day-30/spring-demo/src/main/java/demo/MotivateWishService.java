package demo;

import org.springframework.stereotype.Component;

@Component
public class MotivateWishService implements WishService {
    @Override
    public String getWish() {
        return "Come on!!!!!";
    }
}
