package day_15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
//        Date currentDate = new Date(100, 1, 1);
//        System.out.println(currentDate);
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());


//        LocalDate currentDate = LocalDate.now();
//        System.out.println(currentDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        LocalDate startDate = LocalDate.of(2025, 2, 1);
        LocalDate endDate = LocalDate.of(2025, 2, 2);

        System.out.println(ChronoUnit.DAYS.between(startDate, endDate));
    }
}
