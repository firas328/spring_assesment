package org.springHandOn.services;

import org.aspectj.lang.annotation.Aspect;
import org.springHandOn.interfaces.LogAspect;
import org.springHandOn.interfaces.Speakers;
import org.springHandOn.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springHandOn.models.Song;

import java.util.logging.Logger;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;




    @LogAspect
    public void playMusic(boolean isVehicleStart,Song song){
        speakers.useSpeakers(song);
    }
    @LogAspect
    public void moveVehicle(boolean isVehicleStart){
        tyres.rotate();
    }

    public void applyBrake(boolean isVehicleStart){
        tyres.brake();
    }


    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }


}
