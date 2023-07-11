
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
        employeeArray[0] = new Employee("Иванов Иван Иванович", 1, 50000.0);
        employeeArray[1] = new Employee("Петров Петр Петрович", 2, 68000.0);
        employeeArray[2] = new Employee("Сидоров Сидор Сидорович", 3, 45000.0);
        employeeArray[3] = new Employee("Алексеев Алексей Алексеевич", 4, 50000.0);
        employeeArray[4] = new Employee("Викторов Виктор Викторович", 5, 60000.0);
        employeeArray[5] = new Employee("Грозный Иван Алексеевич", 3, 65000.0);
        employeeArray[6] = new Employee("Алексеева Алиса Андреевна", 1, 80000.0);
        employeeArray[7] = new Employee("Викторова Виктория Викторовна", 2, 70000.0);
        employeeArray[8] = new Employee("Грозная Иванка Юрьевна", 5, 85000.0);
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

        // Проиндексировать зарплаты на 10%
        Employee.changeSalary(10.0, employeeArray);

        // Найти сотрудника с минимальной зарплатой в отделе 1
        Employee minSalaryEmployeeDepartament = Employee.findEmployeeWithMinSalary(1, employeeArray);
        System.out.println("Сотрудник с минимальной зарплатой в отделе 1: "+ minSalaryEmployeeDepartament.toString());

        //Найти сотрудника с максимальной зарплатой в отделе 5
        Employee maxSalaryEmployeeDepartament = Employee.findEmployeeWithMaxSalary(5, employeeArray);
        System.out.println("Сотрудник с максимальной зарплатой в отделе 5: "+ maxSalaryEmployeeDepartament.toString());

        // Посчитать сумму затрат на зарплаты в месяц по отделу
        double totalSalaryDepartament = Employee.calculateTotalSalaryDepartament(3, employeeArray);
        System.out.printf("Сумма затрат на зарплаты в месяц отдела 3: %.2f%n", totalSalaryDepartament);

        // Подсчитать среднее значение зарплат по отделу
        double averageSalaryDepartament = Employee.calculateAverageSalaryDepartament(2, employeeArray);
        System.out.println("Средняя зарплата в отделе 2: " + averageSalaryDepartament);

        // Индексация зарплат сотрудникам отдела
        Employee.changeSalaryDepartament(3, 5.0, employeeArray);

        // Напечатать всех сотрудников отдела 2
        Employee.printEmployeesInDepartment(2, employeeArray);

        // Вывести сотрудников с зарплатой меньше 60000
        Employee.printEmployeesWithSalaryLessThan(60000.0, employeeArray);

        // Вывести сотрудников с зарплатой больше или равной 60000
        Employee.printEmployeesWithSalaryGreaterOrEqualTo(60000.0, employeeArray);
    }

}
