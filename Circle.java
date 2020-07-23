package bai4;

public class Circle extends Shape{

    Point tam; //Tam
    double r; //ban kinh

    Circle() {}

    Circle(Point i, double d) {
        tam = new Point(i.x,i.y);
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

    }

    @Override
    void GetChild(Shape a) {
        if ( (a.ten()=="point") || (a.ten()=="line") ){
            System.out.print("\nGet child!");
        }
        else {
            System.out.print("\nNo child!");
        }
    }

    @Override
    void in() {
        System.out.print("Circle:           tam: ");
        tam.in();
        System.out.print(" , ban kinh "+r);
    }

    Shape CopyConstructor(){
        Shape a = new Circle();
        return a;
    }

    @Override
    Shape Clone() {
        return null;
    }

    @Override
    String ten() {
        return "hinhtron";
    }

}
