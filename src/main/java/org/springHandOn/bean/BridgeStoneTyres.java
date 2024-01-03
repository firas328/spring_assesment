package org.springHandOn.bean;

import org.springHandOn.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    public void useTyres() {
        System.out.println("car use Bridge Stones Tyres");
    }
}
