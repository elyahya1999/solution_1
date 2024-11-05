package org.sid.sol1;

public class EmployeeManager {
    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void changeEmployeeStatus(Employee employee, String newStatus) {
        employee.setStatus(newStatus);
        emailService.sendEmail(employee);
        smsService.sendSMS(employee);
    }
}
