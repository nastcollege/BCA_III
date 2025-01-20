

public class Triangle {

    public void area(double base, double height) {
        System.out.println("Area of Triangle: " + 1.0 / 2 * base * height);
    }

    public double area(double height) {
        double base = 40;
        return (1.0 / 2 * base * height);
    }

    public double area(double base, double height, double form) {
        return (form * base * height);
    }


    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(20, 60);

        double result = t.area(50);
        System.out.println("Width Fix area:" + result);

        double result2 = t.area(33, 66, 0.5);
        System.out.println("Anotehr Area: " + result2);

    }
}
