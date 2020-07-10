package bai4;

public class Rectangular extends Shape {
    double x,y,z; // cdai, crong, ccao

    Rectangular(){}
    Rectangular(double a, double b, double c){
        x = a; y = b; z = c;
    }
    @Override
    void Operation() {
        System.out.print("\nRectangular Operation!");
    }

    @Override
    void Add(Shape a) {
    }

    @Override
    void Remove(Shape a) {
        a = null;
    }

    @Override
    void GetChild(Shape a) {

    }
}
