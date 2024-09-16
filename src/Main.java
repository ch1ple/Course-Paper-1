import java.util.Arrays;

public class Main {
    public static void arrayOutput() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }
    public static void getTotalSalary() {
        int totalSalary = 0;
        double avgSalary;
        int numbersOfEmployeers = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary = totalSalary + employees[i].getSalary();
                numbersOfEmployeers = numbersOfEmployeers + 1;
            }
        }
        avgSalary = (double) totalSalary / numbersOfEmployeers;
        System.out.println("Сумма затрат на зарплаты в месяц составляет - " + totalSalary + " руб.");
        System.out.println("Среднее значение зарплат составляет - " + avgSalary + " руб.");
    }

    public static void getEmployeeWithMinSalary() {
        int minSalary = (int) 10000000;
        int employeeIndex = 0;
        int employeeId = employeeIndex;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    employeeIndex = i;
                }
            }
        }
        employeeId = employeeIndex + 1;
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeId + ". " + employees[employeeIndex].getEmployeesFullName() + " - " + employees[employeeIndex].getSalary() + " руб.");
    }

    public static void getEmployeeWithMaxSalary() {
        int maxSalary = 0;
        int employeeIndex = 0;
        int employeeId = employeeIndex;
        for (int i = employees.length - 1; i >= 0; i = i - 1) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    employeeIndex = i;
                }
            }
        }
        employeeId = employeeIndex + 1;
        System.out.println("Сотрудник с максимальной зарплатой - " + employeeId + ". " + employees[employeeIndex].getEmployeesFullName() + " - " + employees[employeeIndex].getSalary() + " руб.");
    }

    public static void countIndexSalary(int indexSalary) {
        int finalSalary;
        System.out.println("Обновленные зарплаты сотрудников при изменении на " + indexSalary + "% составят:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                finalSalary = employees[i].getSalary() * indexSalary / 100;
                employees[i].setSalary(finalSalary);
                System.out.println((i + 1) + ". " + finalSalary + " руб.");
            }
        }
    }

    public static void findMinSalaryEmployeeByDepartmentNumber(int departmentNumber) {
        int minSalary = (int) 10000000;
        int employeeIndex = 0;
        int employeeId = employeeIndex;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    employeeIndex = i;
                }
            }
        }
        employeeId = employeeIndex + 1;
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeId + ". " + employees[employeeIndex].getEmployeesFullName() + " - " + employees[employeeIndex].getSalary() + " руб.");
    }

    public static void findMaxSalaryEmployeeByDepartmentNumber(int departmentNumber) {
        int maxSalary = 0;
        int employeeIndex = 0;
        int employeeId = employeeIndex;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    employeeIndex = i;
                }
            }
        }
        employeeId = employeeIndex + 1;
        System.out.println("Сотрудник с максимальной зарплатой - " + employeeId + ". " + employees[employeeIndex].getEmployeesFullName() + " - " + employees[employeeIndex].getSalary() + " руб.");
    }

    public static void countTotalSalaryInTheDepartment(int departmentNumber) {
        int totalSalary = 0;
        double avgSalary;
        int numbersOfEmployeers = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
                totalSalary = totalSalary + employees[i].getSalary();
                numbersOfEmployeers = numbersOfEmployeers + 1;
            }
        }
        avgSalary = (double) totalSalary / numbersOfEmployeers;
        System.out.println("Сумма затрат на зарплаты в месяц составляет - " + totalSalary + " руб.");
        System.out.println("Среднее значение зарплат составляет - " + avgSalary + " руб.");
    }

    public static void countIndexSalaryInTheDepartment(int departmentNumber, int indexSalaryInTheDepartment) {
        int finalSalary;
        System.out.println("Обновленные зарплаты сотрудников при изменении на " + indexSalaryInTheDepartment + "% составят:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
                finalSalary = employees[i].getSalary() * indexSalaryInTheDepartment / 100;
                employees[i].setSalary(finalSalary);
                System.out.println((i + 1) + ". " + finalSalary + " руб.");
            }
        }
    }

    public static void employeeDataInTheDepartment(int departmentNumber) {
        System.out.println("Информация по отделу № " + departmentNumber + ":");
        int employeeIndex = 0;
        int employeeId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
                employeeIndex = employeeId + i + 1;
                System.out.println(employeeIndex + ". Ф.И.О. сотрудника - " + employees[i].getEmployeesFullName() + ". Зарплата - " + employees[i].getSalary() + " руб.");
            }
        }
    }

    public static void printSeparator() {
        System.out.println("=========================================================");
    }

    public static void findEmployeesWithSalaryLessThanNumber(int numberToCompare) {
        System.out.println("Дано число " + numberToCompare + " для сравнения зарплат");
        System.out.println("Следующие сотрудники имеют зарплату меньше числа:");
        int employeeIndex = 0;
        int employeeId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < numberToCompare) {
                employeeIndex = employeeId + i + 1;
                System.out.println(employeeIndex + ". Ф.И.О. сотрудника - " + employees[i].getEmployeesFullName() + ". Зарплата - " + employees[i].getSalary() + " руб.");
            }
        }
    }
    public static void findEmployeeWithSalaryMoreThanNumber(int numberToCompare) {
        System.out.println("Следующие сотрудники имеют зарплату больше числа:");
        int employeeIndex = 0;
        int employeeId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > numberToCompare) {
                employeeIndex = employeeId + i + 1;
                System.out.println(employeeIndex + ". Ф.И.О. сотрудника - " + employees[i].getEmployeesFullName() + ". Зарплата - " + employees[i].getSalary() + " руб.");
            }
        }
    }
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee(new EmployeesFullName("Михайлов", "Алексей", "Антонович"), 1, 500_000);
        employees[1] = new Employee(new EmployeesFullName("Кириллова", "Злата", "Данииловна"), 2, 200_000);
        employees[1].setDepartment(2);
        employees[2] = new Employee(new EmployeesFullName("Ермилова", "Мария", "Алексеевна"), 1, 200_000);
        employees[2].setSalary(50_000);
        employees[3] = new Employee(new EmployeesFullName("Кулагина", "Вероника", "Дамировна"), 5, 400_000);
        employees[4] = new Employee(new EmployeesFullName("Максимов", "Марк", "Константинович"), 1, 100_000);
        employees[5] = new Employee(new EmployeesFullName("Соколов", "Савва", "Андреевич"), 1, 300_000);
        printSeparator();
        arrayOutput();
        getTotalSalary();
        getEmployeeWithMinSalary();
        getEmployeeWithMaxSalary();
        int indexSalary = 10;
        countIndexSalary(indexSalary);
        int departmentNumber = 1;
        printSeparator();
        employeeDataInTheDepartment(departmentNumber);
        findMinSalaryEmployeeByDepartmentNumber(departmentNumber);
        findMaxSalaryEmployeeByDepartmentNumber(departmentNumber);
        countTotalSalaryInTheDepartment(departmentNumber);
        int indexSalaryInTheDepartment = 20;
        countIndexSalaryInTheDepartment(departmentNumber, indexSalaryInTheDepartment);
        printSeparator();
        int numberToCompare = 225_000;
        findEmployeesWithSalaryLessThanNumber(numberToCompare);
        findEmployeeWithSalaryMoreThanNumber(numberToCompare);
    }
}