package org.springHandOn.bean;

import org.springHandOn.interfaces.Tyres;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BridgeStoneTyres implements Tyres {
    public void useTyres() {
        System.out.println("car use Bridge Stones Tyres");
    }
}
