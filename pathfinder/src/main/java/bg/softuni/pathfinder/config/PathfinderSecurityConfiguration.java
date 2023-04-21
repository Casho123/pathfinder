package bg.softuni.pathfinder.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class PathfinderSecurityConfiguration {



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {

    }
}
