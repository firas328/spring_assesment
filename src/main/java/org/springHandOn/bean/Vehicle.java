package org.springHandOn.bean;

import org.springHandOn.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Vehicle {
    public VehicleService getVehicleService() {
        return vehicleService;
    }

    private final VehicleService vehicleService;
    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService=vehicleService;
    }

}
