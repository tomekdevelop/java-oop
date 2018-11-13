package task1OPP;

public class Square extends Rectangle {

    public Square(double a, String color){
        super(a, a, color);
    }

    @Override
    public void setA(double a){
        System.out.println("Set w kwadracie");
        this.a = a;
        this.b = a;
    }

    @Override
    public void setB(double b){
        this.a = b;
        this.b = b;
    }


}
