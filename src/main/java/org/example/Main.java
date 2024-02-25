package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)  {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
//        Car car1 = (Car) applicationContext.getBean("car");
//        car1.setName("toyota");
//        Car car2 = (Car) applicationContext.getBean("car");
//        car2.setName("nissan");
//        car2.setEngine(new Engine());
//        Car car3 = (Car) applicationContext.getBean("car");
//        car3.setName("kia");
//        Car car4 = (Car) applicationContext.getBean("car");
//        car4.setName("mercedec");
//        car1.run();
//        car2.run();
//        car3.run();
//        car4.run();
        Car peugeot = (Car) applicationContext.getBean("car");
        peugeot.run();


    }
}