package task1OPP;

public class Rectangle extends Figure {

    protected double a;
    protected double b;


    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;

    }


    public double countArea() {
        return a * b;
    }

    public double countPerimeter() {
        return (2 * a) + (2 * b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        System.out.println("Set w prostokacie");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


}
