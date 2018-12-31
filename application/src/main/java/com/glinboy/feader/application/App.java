package com.glinboy.feader.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.glinboy.feader.model"})
@ComponentScan(basePackages = {"com.glinboy.feader"})
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
