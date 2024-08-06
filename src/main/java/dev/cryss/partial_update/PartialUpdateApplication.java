package dev.cryss.partial_update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan("dev.cryss.partial_update.entity")
//@EnableJpaRepositories("dev.cryss.partial_update.repository")
//@ComponentScan(basePackages = "dev.cryss.partial_update.**")
//@ComponentScan
public class PartialUpdateApplication  {

    public static void main(String[] args) {
        SpringApplication.run(PartialUpdateApplication.class, args);
    }

}
