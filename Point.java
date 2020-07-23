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

    }

    @Override
    void GetChild(Shape a) {
        System.out.print("\nNo children...");
    }

    @Override
    void in() {
        System.out.print("Point: ("+x+","+y+") ");
    }

    Shape CopyConstructor(){
        Shape a = new Point();
        return a;
    }

    @Override
    Shape Clone() {
        Point p2 = new Point(x,y);
        return p2;
    }

    @Override
    String ten() {
        return "point";
    }

    //get, set:
    double getHoanhdo() {
        return x;
    }
    double getTungo() {
        return y;
    }

}