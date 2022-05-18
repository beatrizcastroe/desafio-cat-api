package org.itau.cats.infra.configuration;


import org.itau.cats.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TaskListener implements TaskExecutionListener {

    @Autowired
    @Lazy
    private CatService catService;

    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        catService.getAllBreeds();
        catService.getImagesByCategory(4L);
        catService.getImagesByCategory(1L);
        System.out.println("Oi");
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        System.out.println("Executado.");
    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
        System.out.println("Falhou!");
    }
}
