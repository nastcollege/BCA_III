public class DalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.a=52;
        c.b=65;
        System.out.println(c.a+c.b);
        c.add(10,20);
    }
}
