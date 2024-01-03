package org.springHandOn.bean;

import org.springHandOn.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
