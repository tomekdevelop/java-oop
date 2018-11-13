package task1OPP;

public class OPP_test_polimorfizm {

    public static void main(String[] args) {
        Square myRect = new Square(10, "red");
        Rectangle mySquare = new Rectangle(10, 20, "black");
        Diamond myDiamond = new Diamond(10, 20, 5, "green");
        Triangle myTriangle = new Triangle(10, 6, "czarny");

        Figure[] figures = new Figure[4];
        figures[0] = myRect;
        figures[1] = mySquare;
        figures[2] = myDiamond;
        figures[3] = myTriangle;

        double area = 0.0;
        for (Figure figure : figures) {
            area += figure.countArea();
        }

        System.out.println("Area of all fields: " + area);

    }
}
