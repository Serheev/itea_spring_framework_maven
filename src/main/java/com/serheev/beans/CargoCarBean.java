package com.serheev.beans;

import com.serheev.interfaces.Car;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CargoCarBean implements Car, BeanPostProcessor {
    private static Logger log = Logger.getLogger(CargoCarBean.class);

    public void doMyInit() {
        log.info("Doing initialization...");
    }

    public void doMyDestroy() {
        log.info("Doing Destruction...");
    }

    @Override
    public String getCar() {
        return "This is a Truck";
    }
}
