package bai_th4_b1;


import java.security.PublicKey;

abstract class Shape {
    protected int x, y;
    public Shape(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public Shape() {}

    public void Operation() {}
    public void Add(Shape a) {}
    public void Remove(Shape a) {
        if(x==a.x && y==a.y){
            x =0; y=0;
        }
    }
    public void GetChild(int s) {}
    public void CopyConstructor(){}
    public Shape Clone(){ return null;}
}

class Point extends Shape{
    public Point(){}
    public Point(int x1, int y1) {
        x= x1;
        y= y1;
    }
    public void Remove(Point a) {
        if(x==a.x && y==a.y){
            x =0; y=0;
        }
    }
    public void GetChild(int s) {}
    public void CopyConstructor(){
        new Point(x,y);
    }
    public Point Clone(){
        Point a = null;
        a.x = x;
        a.y = y;
        return a;
    }
}

class Line extends Shape{
    float a, b;
    public Line(float a, float b){}
    public Line(Shape s1, Shape s2) {
        if(s1.x == s2.x){
            System.out.print("\n\tDuong thang : y = "+s1.x+"x");
        }else if(s1.y == s2.y){
            System.out.print("\n\tDuong thang : y = "+s1.y);
        }else {
            a = (s2.y -s1.y)/(s2.x-s1.x);
            b = (s1.y*s2.x - s1.x*s2.y)/(s2.x-s1.x);
            System.out.print("\n\tDuong thang : y = "+a+"x + "+b);
        }
    }

    public void Operation() {}
    public void Add(Line l) {}
    public void Remove(Line l) {
        if(a==l.a && b==l.b){
            a =0; b=0;
        }
    }
    public void CopyConstructor(){
        new Line(a,b);
    }
    public Line Clone(){
        Line l = null;
        l.a = a;
        l.b = b;
        return l;
    }
}

class Circle extends Shape{
    Point a;
    int r;
    public Circle() {}
    public Circle(Point a, int r) {
        System.out.print("\nHinh tron tam ("+a.x+","+a.y+") va ban kinh "+r);
        System.out.print(" co dien tich la: "+r*r*3.1415);
    }
    public void Operation() {}
    public void Add(Shape a) {
        if( (x-a.x)*(x-a.x)+(y-a.y)*(y-a.y) >= r*r){
            System.out.print("thuoc hinh tron.");
        }else{
            System.out.print("nam ngoai hinh tron!");
        }
    }
    public void Remove(Shape a) {
        if(a.x==a.x && a.y==a.y){
            a.x =0; a.y=0; r=0;
        }
    }
    public void GetChild(int s) {
        if(r>s){
            System.out.print("\nHinh tron tam ("+x+","+y+") va ban kinh "+s+" la hinh tron con!");
        }
        else{
            System.out.print("\nKhong phai la!");
        }
    }
    public void CopyConstructor(){
        new Circle(a,r);
    }
    public Circle Clone(){
        Circle c = null;
        c.a = a;
        c.r = r;
        return c;
    }
}

class Graphic extends Shape{
    int n;
    Graphic(int _x, int _y) {
        super(_x, _y);
    }
    public Shape[] a = new Shape[n];
    public void Operation() {}
    public void Add(Shape a) {}
    public void Remove(Shape s) {
        for (int i = 0; i < n; i++) {
            if( a[i]== s){
                a[i].Remove(s);
                System.out.print("\nDa xoa!");
            }
        }
    }
    public void GetChild(int s) {
        if(n>s){
            System.out.print("\nOK");
        }
        else{
            System.out.print("\nSai roi!");
        }
    }
    public void CopyConstructor(){}
    public Graphic Clone(Graphic g){
        a = g.a;
        return g;
    }
}
