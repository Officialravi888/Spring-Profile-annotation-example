//package org.example.Config1;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class SpringProfileDemo {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-*.xml");
//        ctx.getEnvironment().setActiveProfiles("prod");
//        ctx.refresh();
//        Student student = (Student) ctx.getBean("student");
//        System.out.println("id" + student.id + "Name" + student.name);
//
//        // Development environment.
//        ctx.getEnvironment().setActiveProfiles("dev");
//        ctx.refresh();
//        Student = (Student) ctx.getBean("user");
//        System.out.println("id:" + student.id + ", Name:" + student.name);
//
//        // Testing environment profile
//        ctx.getEnvironment().setActiveProfiles("test");
//        ctx.refresh();
//        Student = (Student) ctx.getBean("user");
//        System.out.println("id:" + student.id + ", Name:" + user.name);
//    }
//    }
//}
