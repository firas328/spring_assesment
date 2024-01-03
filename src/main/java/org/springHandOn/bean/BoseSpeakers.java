package org.springHandOn.bean;

import org.springHandOn.interfaces.Speakers;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BoseSpeakers implements Speakers {

    public void useSpeakers(){
        System.out.println("use bose speakers");
    }
}
