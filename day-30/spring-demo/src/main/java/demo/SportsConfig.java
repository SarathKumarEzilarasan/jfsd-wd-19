package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration
@ComponentScan("demo")
@PropertySource("sports.properties")
public class SportsConfig {

    @Bean
    public ArrayList arrayList(){
        return new ArrayList();
    }
}
