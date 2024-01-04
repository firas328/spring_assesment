package org.springHandOn.bean;


import org.springHandOn.interfaces.Tyres;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MichelinTyres implements Tyres {
    public void rotate() {
        System.out.println("car move using Michelin Tyres");
    }
    public void brake(){
        System.out.println("break");  }
}
