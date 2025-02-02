package poly;

public class Shape {
    private String name;
    private String color;

    void draw(){
        System.out.println("Shape Draw");
    }

    void setInfo(String name, String color){
        this.name=name;
        this.color=color;
    }

    void displayInfo(){
        System.out.println("Name: "+name + " Color:"+color);
    }
}
