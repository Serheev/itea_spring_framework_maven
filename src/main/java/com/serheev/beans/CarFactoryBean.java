package com.serheev.beans;

import com.serheev.interfaces.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CarFactoryBean {
    private static Logger log = Logger.getLogger(CarFactoryBean.class);

    private Car car;
    private String model;
    private String engine;
    private String transmission;

    public void makeCar() {
        log.info("Simon says - " + car.getCar() + " (" + model + " : " + engine + " : " + transmission + ")");
    }
}
