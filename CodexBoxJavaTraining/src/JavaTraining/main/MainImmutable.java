package JavaTraining.main;

import JavaTraining.sample.immutable.ImmutabilityExamples;

public class MainImmutable
{
    public static void main(String[] args) {
        ImmutabilityExamples immutabilityExamples = new ImmutabilityExamples(202256,"L Mohammed Junaid",6285.90,"7702810210");
        System.out.println("EmployeeId is: " + immutabilityExamples.getEmployeeId());
        System.out.println( "Employee name is: " + immutabilityExamples.getEmployeeName());
        System.out.println("Employee Salary is: " + immutabilityExamples.getEmployeeSalary());
        long longValue = Long.parseLong(immutabilityExamples.getEmployeePhoneNumber());
        System.out.println("Employee Phone number is: " + longValue);
    }


}

