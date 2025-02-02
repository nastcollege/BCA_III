public class Student {
    private String name;
    private int age;

    public void setStudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
