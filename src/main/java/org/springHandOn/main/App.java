package org.springHandOn.main;

import org.springHandOn.bean.Person;
import org.springHandOn.config.projectConfig;
import org.springHandOn.models.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        String singerName="Balti";
        String songName="Hamama Taret";
        var song=new Song(singerName,songName);
        var context= new AnnotationConfigApplicationContext(projectConfig.class);
        Person person=context.getBean(Person.class);
        person.getVehicle().getVehicleService().playMusic(song);
        person.getVehicle().getVehicleService().moveVehicle();
        person.getVehicle().getVehicleService().applyBrake();
    }
}
