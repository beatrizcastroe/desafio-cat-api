package org.itau.cats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableTask
@EntityScan("org.itau.api.model")
@EnableJpaRepositories("org.itau.api.repository")
@EnableFeignClients
public class AboutCatsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AboutCatsApplication.class, args);
    }

}
