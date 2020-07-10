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

    @Override
    void in() {
        System.out.print("Rectangular :         chieu dai: "+x+" ,chieu rong: "+y+", chieu cao: "+z);
    }

    Shape CopyConstructor(){
        Shape a = new Rectangular();
        return a;
    }
}
