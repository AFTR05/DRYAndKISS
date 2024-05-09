package co.edu.cue;

public class Main {
    public static void main(String[] args) {
        // Crear el administrador de empleados
        EmployeeManager manager = new EmployeeManager();

        // Agregar empleados con bonificaciones y deducciones
        manager.addEmployee(new Employee("Pablo", 25, 3000.0, 100.0, 50.0));
        manager.addEmployee(new Employee("Nico", 30, 3500.0, 150.0, 70.0));

        // Calcular y mostrar la suma de todos los salarios
        double totalSalaries = manager.calculateSumOfSalaries();
        System.out.println("Total Salaries: " + totalSalaries);

        // Calcular y mostrar el salario de cada empleado
        System.out.println("Employee Salaries:");
        System.out.println(manager.calculateEmployeesSalary());

        // Mostrar información de todos los empleados
        System.out.println("Employee Information:");
        manager.getAllEmployeeInfo();
    }
}