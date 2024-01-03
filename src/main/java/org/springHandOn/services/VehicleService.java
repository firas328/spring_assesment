package org.springHandOn.services;

import org.springHandOn.interfaces.Speakers;
import org.springHandOn.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleService {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;
    public void playMusic(){
        speakers.useSpeakers();
    }
    public void move(){
        tyres.useTyres();
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
