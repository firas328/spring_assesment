package org.springHandOn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.springHandOn.bean",
            basePackageClasses = org.springHandOn.services.VehicleService.class)
public class projectConfig {
}
