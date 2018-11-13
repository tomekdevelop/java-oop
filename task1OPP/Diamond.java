package task1OPP;// private zmiennej nie mozna zmienic z poza klasy
// public jest publiczna mozna zmienic z poza klasy
// brak public lub privat oznacza ze jest widoczny w obrebie pakietu

public class Diamond extends Figure {
    private double e;
    private double f;
    private double a;

    public Diamond(double e, double f, double a, String color) {
        super(color);
        this.e = e;
        this.f = f;
        this.a = a;

    }

    public Diamond(double a, String color){
        super(color);
        this.a = a;
        e = a/10;
        f = a/5;
    }

    public double countArea() {
        return e * f;
    }

    void incrementE(){
        e++;
    }
}
