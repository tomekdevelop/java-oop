package task1OPP;

import exeptions.InvalidSideExeption;

public class Triangle implements AreaCountable {
    protected double a;
    protected double h;

    public Triangle(double a, double h) {



        this.a = a;
        this.h = h;
    }


    public double countArea() {
        return 0.5 * a * h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
