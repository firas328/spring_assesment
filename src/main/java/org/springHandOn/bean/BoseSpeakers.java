package org.springHandOn.bean;

import org.springHandOn.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public void useSpeakers(){
        System.out.println("use bose speakers");
    }
}
