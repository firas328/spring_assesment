package org.springHandOn.services;

import org.springHandOn.interfaces.Speakers;
import org.springHandOn.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springHandOn.models.Song;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public void playMusic(Song song){
        speakers.useSpeakers(song);
    }
    public void moveVehicle(){
        tyres.rotate();
    }
    public void applyBrake(){
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
