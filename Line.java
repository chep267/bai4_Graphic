package dongcode.bai4;

public class Line extends Shape {

    Point p1, p2; //2 diem

    Line() {}

    Line(Point a, Point b){
        p1 = a;
        p2 = b;
    }

    void Operation() {
        System.out.println("Line Operation!");
    }

    void Add(Shape a) {
    }

    void Remove(Shape a) {

    }

    void GetChild(Shape a) {
        if( a.ten().equals("point ") ) {
            System.out.println("Get child!");
        }
        else {
            System.out.println("No child!");
        }
    }

    void in() {
        System.out.print("Line:         ");
        p1.in(); p2.in();
    }


    Shape CopyConstructor() {
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
