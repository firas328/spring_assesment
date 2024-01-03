package org.springHandOn.main;

import org.springHandOn.bean.Person;
import org.springHandOn.config.projectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ) {


        var context= new AnnotationConfigApplicationContext(projectConfig.class);
        Person person=context.getBean(Person.class);
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().move();
    }
}
