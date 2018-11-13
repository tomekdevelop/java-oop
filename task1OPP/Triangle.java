package task1OPP;

public class Triangle extends Figure {
    protected double a;
    protected double h;

    public Triangle(double a, double h, String color) {
        super(color);
        this.a = a;
        this.h = h;
    }


    public double countArea() {
        return 0.5 * a * h;
    }


}
