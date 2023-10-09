import java.util.SplittableRandom;

public class Pyramid {
    public static void main(String[] args) {
        PyramidCalc p1=new PyramidCalc(" pyramid 1: ", 5, 10);
        PyramidCalc p2=new PyramidCalc(" pyramid 2: ", 8, 10);
        PyramidCalc p3=new PyramidCalc(" pyramid 3: ", 10, 10);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}

class PyramidCalc {
    String name;
    double side1;
    double height;

    PyramidCalc (String n, double s1, double h){
        name = n;
        side1 = s1;
        height = h;

    }

    @Override
    public String toString() {
        return name + side1* + side1* + height/4;
    }
}