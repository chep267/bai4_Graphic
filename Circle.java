package dongcode.bai4;

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
        System.out.println("Circle Operation!");
    }

    @Override
    void Add(Shape a) {

    }

    @Override
    void Remove(Shape a) {

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
        System.out.print("Circle:           tam: ");
        tam.in();
        System.out.print(" , ban kinh " + r);
    }

    Shape CopyConstructor() {
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
