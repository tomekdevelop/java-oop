public class Rectangle {

    double a;
    double b;


    public Rectangle(double a, double b) {
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



