package bai4;

public class Line extends Shape {
    Point p1, p2; //2 diem
    Line(){}
    Line(Point a, Point b){
        p1 = a;
        p2 = b;
    }

    @Override
    void Operation() {
        System.out.print("\nLine Operation!");
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
        System.out.print("Line:         ");
        p1.in(); p2.in();
    }

    Point getDiem1(){
        return p1;
    }
    Point getDiem2(){
        return p2;
    }

}
