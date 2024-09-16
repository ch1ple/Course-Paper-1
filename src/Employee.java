public class Employee {
    private EmployeesFullName employeesFullName;
    private int department;
    private int salary;
    private int id = 0;
    private static int idCounter = 0;

    public Employee(EmployeesFullName employeesFullName, int department, int salary) {
        this.employeesFullName = employeesFullName;
        this.department = department;
        this.salary = salary;
        idCounter++;
        id = idCounter;
    }
    public EmployeesFullName getEmployeesFullName() {
        return employeesFullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
    public void setDepartment(int department) {
        if (department < 0) {
            throw new IllegalArgumentException("Номер отдела не может бьыть отрицательным");
        }
        this.department = department;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salary = salary;
    }

    public String toString() {
        return id + ". Ф.И.О. сотрудника - " + employeesFullName + ". № Отдела - " + department + ". Зарплата - " + salary + " руб.";
    }
}
