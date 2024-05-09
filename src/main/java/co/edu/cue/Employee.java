package co.edu.cue;

public class Employee {
    private String name;
    private Integer age;
    private Double baseMonthlySalary;
    private Double salaryBonus;
    private Double salaryDeductions;

    public double calculateMonthlySalary() {
        if (salaryBonus < 0 || salaryDeductions < 0) {
            throw new IllegalArgumentException("Bonuses and deductions cannot be negative");
        } else {
            return baseMonthlySalary + salaryBonus - salaryDeductions;
        }
    }

    public String displayEmployeeInfo() {
        return "Employee Name: " + name + " - Employee Age: " + age + " - Employee Base Monthly Salary: " + baseMonthlySalary +
                " - Salary Bonus: " + salaryBonus + " - Salary Deductions: " + salaryDeductions;
    }


    public Employee(String name, Integer age, Double baseMonthlySalary, Double salaryBonus, Double salaryDeductions) {
        this.name = name;
        this.age = age;
        this.baseMonthlySalary = baseMonthlySalary;
        this.salaryBonus = salaryBonus;
        this.salaryDeductions = salaryDeductions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBaseMonthlySalary(Double baseMonthlySalary) {
        this.baseMonthlySalary = baseMonthlySalary;
    }

    public Double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(Double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public Double getSalaryDeductions() {
        return salaryDeductions;
    }

    public void setSalaryDeductions(Double salaryDeductions) {
        this.salaryDeductions = salaryDeductions;
    }
}
