package java_27_9;

public class Employee {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    private  String name;
    private  int employeeId;
    private  String position;
    private  int salary;
    public Employee(String name, int employeeId, String position, int salary){
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }
    public void calculateAnnualSalary(){
        System.out.println("Annual salary for " + name + ": " + salary * 12);
    }

    public  void main(String[] args) {
        Employee employee = new Employee("John Doe", 1, "Manager", 50000);
        employee.calculateAnnualSalary();
    }
}
