package com.fastcampus.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;


class Car{}
@Component class Engine{} // <bean id = "engine" class = "... Engine"/>
@Component class AEngine extends Engine{} // <bean id = "aengine", . />
@Component class BEngine extends Engine{} // <bean id = "bengine, ... />
class Door{}

public class SpringDiTest {
    public static void main(String[] args) {
        ApplicationContext ac = new GenericXmlApplicationContext("config.xml");

        Car car = (Car)ac.getBean("car");
        Car car2 = ac.getBean("car", Car.class);

        Engine engine = (Engine)ac.getBean("engine");
        Door door = (Door)ac.getBean("door");
    }
}