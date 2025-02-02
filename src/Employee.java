public class Employee extends Person {
    public void getSalary() {
        System.out.println("Your salary is :5000000");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        emp.getSalary();
    }
}
