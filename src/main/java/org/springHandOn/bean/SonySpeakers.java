package org.springHandOn.bean;

import org.springHandOn.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    public void useSpeakers(){
        System.out.println("use  Sony speakers");
    }
}
