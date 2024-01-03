package org.springHandOn.bean;


import org.springHandOn.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    public void useTyres() {
        System.out.println("car use Michelin Tyres");
    }
}
