public class ShapeClient {
    public static void main(String[] args) {
        Shape a = new Shape("0 0 0 1 1 1 1 0");
        Shape b = new Shape("10 10 10 11 11 11 11 10");
        Shape c = new Shape("0.5 0.5 0.5 -10 1.5 0");
        Shape d = new Shape("0.5 0.5 0.75 0.75 0.75 0.2");

        if(a.checkCross(b)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(a.checkCross(c)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(a.checkCross(d)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(a.encircle(b));
        System.out.println(a.encircle(c));
        System.out.println(a.encircle(d));

    }
}
