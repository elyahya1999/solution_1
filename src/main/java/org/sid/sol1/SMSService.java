package org.sid.sol1;

public class SMSService {
    public void sendSMS(Employee employee) {
        System.out.println("Sending SMS to " + employee.getName() + " with status: " + employee.getStatus());
    }
}
