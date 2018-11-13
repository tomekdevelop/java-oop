package task1OPP;

public class OPP_test {

    public static void main(String[] args) {

        Square smallSquare = new Square(10, "czerwony");
        Square bigSquare = new Square(11, "czerwony");

        String napis1 = new String("a");
        String napis2 = new String("a");

        if(napis1.equals(napis2)){
            System.out.println("takie same");
        }else {
            System.out.println("nie sa takie same");
        }


        if(smallSquare.equals(bigSquare)){
            System.out.println("sa rowne");
        }else {
            System.out.println("nie sa");
        }




    }
}
