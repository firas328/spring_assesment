package org.springHandOn.bean;


import org.springHandOn.interfaces.Tyres;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MichelinTyres implements Tyres {
    public void useTyres() {
        System.out.println("car use Michelin Tyres");
    }
}
