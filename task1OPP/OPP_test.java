package task1OPP;

public class OPP_test {

    public static void main(String[] args) {

        Square square1 = new Square(10, "czerwony");
        Rectangle rectangle1 = new Rectangle(10, 20, "niebieski");

        System.out.println("Prostokat: "+ rectangle1.countArea());
        System.out.println("Kwadrat: "+ square1.countArea());

        square1.setA(5);
        rectangle1.setA(4);

    }
}
