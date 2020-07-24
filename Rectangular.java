package dongcode.bai4;

public class Rectangular extends Shape {
    double x,y,z; // cdai, crong, ccao

    Rectangular() {}

    Rectangular(double a, double b, double c) {
        x = a; y = b; z = c;
    }

    @Override
    void Operation() {
        System.out.println("Rectangular Operation!");
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
        if ( (a.ten().equals("point")) || (a.ten().equals("line")) ){
            System.out.println("Get child!");
        }
        else {
            System.out.println("No child!");
        }
    }

    @Override
    void in() {
        System.out.println("Rectangular :         chieu dai: "+x+" ,chieu rong: "+y+", chieu cao: "+z);
    }


    Shape CopyConstructor() {
        Shape a = new Rectangular();
        return a;
    }

    @Override
    Shape Clone() {
        Rectangular r2 = new Rectangular( x,y,z );
        return r2;
    }

    @Override
    String ten() {
        return "tamgiac";
    }
}
