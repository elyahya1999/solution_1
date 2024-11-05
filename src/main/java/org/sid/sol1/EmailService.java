package org.sid.sol1;

public class EmailService {
    public void sendEmail(Employee employee) {
        System.out.println("Sending email to " + employee.getName() + " with status: " + employee.getStatus());
    }
}
