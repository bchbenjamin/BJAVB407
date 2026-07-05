package DataStructuesAndObjects;
public class Employee {
    int id;
    String name;
    float salary;
    public void raiseSalary(int percentage)
    {
        float salary_old = salary;
        salary += percentage*salary_old / 100;
        System.out.printf("Salary increased from %.2f to %.2f\n", salary_old, salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1001;
        e1.name = "Benjamin";
        e1.salary = 45000;
        e1.raiseSalary(100);
    }
}
