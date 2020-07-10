package bai4;

class Point extends Shape {
    double x,y; //Hoanh do, tung do
    Point(){}
    Point(double d1, double d2){
        x = d1;
        y = d2;
    }


    @Override
    void Operation() {
        System.out.print("\nPoint Operation!");
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
        System.out.print("\nNo children...");
    }

    @Override
    void in() {
        System.out.print("Point: ("+x+","+y+") ");
    }

    double getX() {
        return x;
    }
    double getY() {
        return y;
    }

}