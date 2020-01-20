package com.serheev.beans;

import com.serheev.interfaces.Employee;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MechanicBean implements Employee, BeanPostProcessor {
    private static Logger log = Logger.getLogger(MechanicBean.class);

    public void doMyInit() {
        log.info("Doing initialization...");
    }

    public void doMyDestroy() {
        log.info("Doing Destruction...");
    }

    @Override
    public String getEmployee() {
        return "I'm a mechanic!";
    }
}
