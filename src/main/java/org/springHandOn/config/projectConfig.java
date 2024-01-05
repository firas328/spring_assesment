package org.springHandOn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.springHandOn.bean","org.springHandOn.aspects"},
            basePackageClasses = org.springHandOn.services.VehicleService.class)
@EnableAspectJAutoProxy
public class projectConfig {
}
