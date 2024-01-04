package org.springHandOn.bean;

import org.springHandOn.interfaces.Speakers;
import org.springHandOn.models.Song;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SonySpeakers implements Speakers {
    public void useSpeakers(Song song){
        System.out.println(String.format("play %s using Sony speakers",song.toString()));
    }
}
