class Employee {
    private int salary;
    private String name;
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rahul");
        emp.setSalary(50000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
