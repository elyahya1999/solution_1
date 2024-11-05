package org.sid;

import org.sid.sol1.Employee;
import org.sid.sol1.EmployeeManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("said sylvie", "Active");
        EmployeeManager manager = new EmployeeManager();
        manager.changeEmployeeStatus(employee, "db 3ad conge");
    }
}