package bai4;

public class Circle extends Shape{
    Point I; //Tam
    double r; //ban kinh
    Circle(){}
    Circle(Point i, double d){
        I = i;
        r = d;
    }
    @Override
    void Operation() {
        System.out.print("\nCircle Operation!");
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
