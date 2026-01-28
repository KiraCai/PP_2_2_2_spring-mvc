package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegionConfig {

    @Bean
    public Region region() {
        return new Region();
    }

    @Bean
    public Pays pays() {
        return new Pays();
    }

    @Bean
    public Ville capitaleRegion() {
        return new Ville();
    }

    @Bean
    public Ville megaPole() {
        return new Ville();
    }
}
