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

    }

    void GetChild(Shape a) {
        if( a.ten()=="point " ) {
            System.out.print("\nGet child!");
        }
        else {
            System.out.print("\nNo child!");
        }
    }

    void in() {
        System.out.print("Line:         ");
        p1.in(); p2.in();
    }


    Shape CopyConstructor(){
        Shape a = new Line();
        return a;
    }

    @Override
    Shape Clone() {
        Line l2 = new Line(p1,p2);
        return l2;
    }

    @Override
    String ten() {
        return "line";
    }

    //get:
    Point getDiem1(){
        return p1;
    }
    Point getDiem2(){
        return p2;
    }

}
