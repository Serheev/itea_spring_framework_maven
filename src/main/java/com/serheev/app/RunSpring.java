package com.serheev.app;

import com.serheev.beans.CarFactoryBean;
import com.serheev.beans.HRDepartmentBean;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    private static Logger log = Logger.getLogger(RunSpring.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /** Singleton scope beans */
        HRDepartmentBean driver = context.getBean("driverEmployee", HRDepartmentBean.class);
        HRDepartmentBean mechanic = context.getBean("mechanicEmployee", HRDepartmentBean.class);
        driver.assignEmployee();
        mechanic.assignEmployee();
        log.info(driver);
        log.info(mechanic);

        /** Prototype scope beans */
        CarFactoryBean audi = context.getBean("carPassengerFactory", CarFactoryBean.class);
        CarFactoryBean bmw = context.getBean("carPassengerFactory", CarFactoryBean.class);
        CarFactoryBean man = context.getBean("carCargoFactory", CarFactoryBean.class);
        CarFactoryBean daf = context.getBean("carCargoFactory", CarFactoryBean.class);
        /** Start values */
        audi.makeCar();
        bmw.makeCar();
        man.makeCar();
        daf.makeCar();
        /** Own characteristics */
        audi.setModel("A6");
        bmw.setModel("M5");
        man.setModel("TGS");
        daf.setModel("Euro 6");
        /** New values */
        audi.makeCar();
        bmw.makeCar();
        man.makeCar();
        daf.makeCar();
        log.info(audi);
        log.info(bmw);

        context.close();
    }
}
