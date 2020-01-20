package com.serheev.beans;

import com.serheev.interfaces.Employee;
import org.apache.log4j.Logger;

public class DriverBean implements Employee {
    private static Logger log = Logger.getLogger(DriverBean.class);

    public void doMyInit() {
        log.info("Doing initialization...");
    }

    public void doMyDestroy() {
        log.info("Doing Destruction...");
    }

    @Override
    public String getEmployee() {
        return "I'm a driver!";
    }
}
