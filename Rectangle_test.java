// add getter and setter

public class Rectangle_test {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle_test(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double countArea() {
        return a * b;
    }

    public double countPerimeter() {
        return (2 * a) + (2 * b);
    }


}
