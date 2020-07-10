package bai4;

public class Line extends Shape {
    Point p1, p2; //2 diem
    Line(){}
    Line(Point a, Point b){
        p1 = a;
        p2 = b;
    }

    void Operation() {
        System.out.print("\nLine Operation!");
    }

    void Add(Shape a) {

    }

    void Remove(Shape a) {
        a = null;
    }
    void GetChild(Shape a) {

    }

    void in() {
        System.out.print("Line:         ");
        p1.in(); p2.in();
    }
    Shape CopyConstructor(){
        Shape a = new Line();
        return a;
    }

    Point getDiem1(){
        return p1;
    }
    Point getDiem2(){
        return p2;
    }

}
