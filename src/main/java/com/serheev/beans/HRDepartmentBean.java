package com.serheev.beans;

import com.serheev.interfaces.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HRDepartmentBean {
    private static Logger log = Logger.getLogger(HRDepartmentBean.class);

    private Employee employee;
    private String occupation;

    public void assignEmployee() {
        log.info(employee.getEmployee() + ". I have to do " + occupation);
    }
}
