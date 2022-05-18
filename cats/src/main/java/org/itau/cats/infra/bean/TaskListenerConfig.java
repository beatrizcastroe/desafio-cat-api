package org.itau.cats.infra.bean;

import org.itau.cats.infra.configuration.TaskListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskListenerConfig {

    @Bean
    public TaskListener taskListenerExecution() {
        return new TaskListener();
    }
}
