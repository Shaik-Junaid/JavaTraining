package JavaTraining.sample.immutable;

//Immutability class

public final class ImmutabilityExamples
{
   private final Integer employeeId;
   private final String employeeName;
   private final Double employeeSalary;
   private final String employeePhoneNumber;

    public ImmutabilityExamples(Integer employeeId, String employeeName, Double employeeSalary, String employeePhoneNumber) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }
}
