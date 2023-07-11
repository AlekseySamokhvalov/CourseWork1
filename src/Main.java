
public class Main{
    public static Employee[] employeeArray = new Employee[10];

    public static void printAllEmployees() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0.0;
        for (Employee employee : employeeArray) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employeeArray) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employeeArray) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int employeeCount = 0;
        for (Employee employee : employeeArray) {
            if (employee != null) {
                employeeCount++;
            }
        }
        return totalSalary / employeeCount;
    }

    public static void printEmployeesFullName() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    public static void main(String[] args) {
        // Создаем записи о сотрудниках
        employeeArray[0] = new Employee("Иванов Иван Иванович", 1, 50000.1);
        employeeArray[1] = new Employee("Петров Петр Петрович", 2, 68000.2);
        employeeArray[2] = new Employee("Сидоров Сидор Сидорович", 3, 45000.3);
        employeeArray[3] = new Employee("Алексеев Алексей Алексеевич", 4, 50000.4);
        employeeArray[4] = new Employee("Викторов Виктор Викторович", 5, 60000.5);
        employeeArray[5] = new Employee("Грозный Иван Алексеевич", 3, 65000.6);
        employeeArray[6] = new Employee("Алексеева Алиса Андреевна", 1, 80000.7);
        employeeArray[7] = new Employee("Викторова Виктория Викторовна", 2, 70000.8);
        employeeArray[8] = new Employee("Грозная Иванка Юрьевна", 5, 85000.9);
        employeeArray[9] = new Employee("Алексеевский Александр Алексеевич", 4, 90000.0);

        // Получить список всех сотрудников со всеми имеющимся по ним данными
        printAllEmployees();

        // Посчитать сумму затрат на зарплаты в месяц
        double totalSalary = calculateTotalSalary();
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary);

        // Найти сотрудника с минимальной зарплатой
        Employee minSalaryEmployee = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee.toString());

        // Найти сотрудника с максимальной зарплатой
        Employee maxSalaryEmployee = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee.toString());

        // Подсчитать среднее значение зарплат
        double averageSalary = calculateAverageSalary();
        System.out.println("Средняя зарплата: " + averageSalary);

        // Получить Ф. И. О. всех сотрудников
        printEmployeesFullName();
    }

}
