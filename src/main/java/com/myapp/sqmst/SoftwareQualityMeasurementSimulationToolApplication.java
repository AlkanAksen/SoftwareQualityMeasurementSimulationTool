package com.myapp.sqmst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class SoftwareQualityMeasurementSimulationToolApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SoftwareQualityMeasurementSimulationToolApplication.class);
        app.setDefaultProperties(Map.of(
                "server.address", "0.0.0.0",
                "server.port", "8080"
        ));
        app.run(args);
    }
}