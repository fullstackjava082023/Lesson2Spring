package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    /* <bean id="engine" class="org.example.Engine">

    </bean>*/
    @Bean
    public Engine getEngine() {
        return new Engine();
    }

     /*<bean id="car" class="org.example.Car">
        <property name="name" value="Peugeot"/>
        <property name="engine" ref="engine" />
    </bean>*/

    @Bean(name = "car")
    public Car getCar() {
        Engine engine = getGasEngine();
        Car myNewCar = new Car(engine);
        myNewCar.setName("Peugeot");
        return myNewCar;
    }

    @Bean
    public GasEngine getGasEngine() {
        return new GasEngine();
    }



}
