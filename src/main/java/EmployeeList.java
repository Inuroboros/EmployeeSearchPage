import java.util.ArrayList;

public class EmployeeList {
    private static EmployeeList instance;
    private ArrayList<Employee> employees;

    private EmployeeList() {
        this.employees = new ArrayList<Employee>();
    }

    public static EmployeeList getInstance() {
        if (instance == null) {
            instance = new EmployeeList();
        }
        return instance;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee findEmployee(String login){
        for (Employee employee : employees) {
            if (employee.getUsername().equals(login)) {
                return employee;
            }
        }
        return null;
    }
}
