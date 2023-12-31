package com.example.pushSample;

import com.azure.spring.cloud.appconfiguration.config.AppConfigurationRefresh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.concurrent.ExecutionException;

@RestController
public class HelloController {
    private final MessageProperties properties;

    @Autowired(required = false)
    private AppConfigurationRefresh refresh;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public String getMessage() throws InterruptedException, ExecutionException {
        if (refresh != null) {
            refresh.refreshConfigurations();
        }
        return "Message: " + properties.getMessage();
    }
}