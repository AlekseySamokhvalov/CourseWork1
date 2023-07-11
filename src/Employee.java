public class Employee {
    private static int idCounter = 1;
    private int id;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[id= " + id + ", ФИО: " + fullName + ", Отдел: " + department + ", З/П: " + salary + "]";
    }

    // Метод для изменения зарплаты всех сотрудников на величину в %
    public static void changeSalary(double percent, Employee[] employees) {
        for (Employee employee : employees) {
            double increase = employee.getSalary() * percent / 100.0;
            employee.setSalary(employee.getSalary() + increase);
        }
        System.out.println("Произвели индексирование зарплат");
    }

    // Метод для изменения зарплаты сотрудников отдела на величину в %
    public static void changeSalaryDepartament(int department, double percent, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department){
                double increase = employee.getSalary() * percent / 100.0;
                employee.setSalary(employee.getSalary() + increase);
            }
        }
        System.out.println("Произвели индексирование зарплат отдела " + department);
    }

    // Метод для нахождения сотрудника с минимальной зарплатой в отделе
    public static Employee findEmployeeWithMinSalary(int department, Employee[] employees) {
        Employee minSalaryEmployeeDepartament = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && (minSalaryEmployeeDepartament == null || employee.getSalary() < minSalaryEmployeeDepartament.getSalary())) {
                minSalaryEmployeeDepartament = employee;
            }
        }
        return minSalaryEmployeeDepartament;
    }

    // Аналогичные методы для нахождения сотрудника с максимальной зарплатой, суммы затрат на зарплату, средней зарплаты, проиндексирования зарплаты всех сотрудников и печати всех сотрудников в отделе
    public static Employee findEmployeeWithMaxSalary(int department, Employee[] employees) {
        Employee maxSalaryEmployeeDepartament = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && (maxSalaryEmployeeDepartament == null || employee.getSalary() > maxSalaryEmployeeDepartament.getSalary())) {
                maxSalaryEmployeeDepartament = employee;
            }
        }
        return maxSalaryEmployeeDepartament;
    }

    public static double calculateTotalSalaryDepartament(int department, Employee[] employees) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static double calculateAverageSalaryDepartament(int department, Employee[] employees) {
        double totalSalary = 0.0; //
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee != null) {
                employeeCount++;
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary / employeeCount;
    }
    // Метод для печати всех сотрудников отдела (все данные, кроме отдела)
    public static void printEmployeesInDepartment(int department, Employee[] employees) {
        System.out.println("Сотрудники отдела " + department + ":");
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + ", Имя: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    // Метод для вывода сотрудников с зарплатой меньше заданного числа
    public static void printEmployeesWithSalaryLessThan(double amount, Employee[] employees) {
        System.out.println("Сотрудники с зарплатой меньше " + amount + ":");
        for (Employee employee : employees) {
            if (employee.getSalary() < amount) {
                System.out.println("ID: " + employee.getId() + ", Имя: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    // Метод для вывода сотрудников с зарплатой больше или равной заданному числу
    public static void printEmployeesWithSalaryGreaterOrEqualTo(double amount, Employee[] employees) {
        System.out.println("Сотрудники с зарплатой больше или равной " + amount + ":");
        for (Employee employee : employees) {
            if (employee.getSalary() >= amount) {
                System.out.println("ID: " + employee.getId() + ", Имя: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
}