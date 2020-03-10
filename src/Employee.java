public class Employee implements Payable {
  public String employeeId;
  public String name;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public Employee() {
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return 0.0;
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return name + String.format(format, getAverageMonthlySalary());
  }

  @Override
  public void calculatePay() {

  }
}
