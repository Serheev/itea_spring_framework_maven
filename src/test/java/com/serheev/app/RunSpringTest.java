package com.serheev.app;

import com.serheev.beans.CarFactoryBean;
import com.serheev.beans.HRDepartmentBean;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RunSpringTest {
    private static ClassPathXmlApplicationContext context;
    private static HRDepartmentBean audiDriver;
    private static HRDepartmentBean bmwDriver;
    private static HRDepartmentBean audiMechanic;
    private static HRDepartmentBean bmwMechanic;
    private static CarFactoryBean audi;
    private static CarFactoryBean bmw;
    private static CarFactoryBean man;
    private static CarFactoryBean daf;

    @BeforeClass
    public static void setUp() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /** Singletone scope beans */
        audiDriver = context.getBean("driverEmployee", HRDepartmentBean.class);
        bmwDriver = context.getBean("driverEmployee", HRDepartmentBean.class);
        audiMechanic = context.getBean("mechanicEmployee", HRDepartmentBean.class);
        bmwMechanic = context.getBean("mechanicEmployee", HRDepartmentBean.class);
        /** Prototype scope beans */
        audi = context.getBean("carPassengerFactory", CarFactoryBean.class);
        bmw = context.getBean("carPassengerFactory", CarFactoryBean.class);
        man = context.getBean("carCargoFactory", CarFactoryBean.class);
        daf = context.getBean("carCargoFactory", CarFactoryBean.class);
    }

    @AfterClass
    public static void afterDestroy() {
        context.close();
    }

    @Test
    public void hashCodeShouldBeEquals() {
        assertEquals(audiDriver.hashCode(), bmwDriver.hashCode());
        assertEquals(audiMechanic.hashCode(), bmwMechanic.hashCode());
    }

    @Test
    public void hashCodeIsNotEquals() {
        assertFalse(audi.hashCode() == bmw.hashCode());
        assertFalse(man.hashCode() == daf.hashCode());
    }
}