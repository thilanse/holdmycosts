package org.example.holdmycosts;

import org.example.holdmycosts.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepository repository) {

        return args -> {
//            User user1 = new User("Thilan", "Senenayake", "thilan96", "t321");
//
//            repository.save(user1);

        };
    }
}
