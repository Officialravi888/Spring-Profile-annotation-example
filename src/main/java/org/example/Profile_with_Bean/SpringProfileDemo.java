package org.example.Profile_with_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfileDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("Horse");
        ctx.scan("org.example.Profile_with_Bean");
        ctx.refresh();
        Animal animal=ctx.getBean(Animal.class);
        System.out.println(animal.getMessage());
    }
}
