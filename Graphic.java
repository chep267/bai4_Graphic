package dongcode.bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Graphic extends Shape{

    ArrayList<Shape> ds = new ArrayList<Shape>(); //danh sach



    @Override
    void Operation() {
        System.out.println("Graphic Operation!");
    }

    @Override
    void Add(Shape a) {
        ds.add(a);
    }

    @Override
    void Remove(Shape a) {
        ds.remove(a);
    }

    @Override
    void GetChild(Shape a) {

        if ( (a.ten().equals("dothi")) ) {
            System.out.println("No child!");
        }
        else {
            System.out.println("Get child!");
        }
    }

    @Override
    void in() {
        for
            (Shape a: ds){
                a.in();
                System.out.println();
            }
    }
    Shape CopyConstructor() {
        Shape a = new Graphic();
        return a;
    }

    @Override
    Shape Clone() {

        Graphic g2 = new Graphic();
        g2.ds.addAll(ds);
        return g2;
    }

    @Override
    String ten() {
        return "dothi";
    }

    void themhinh() {
        Shape a = null;
        System.out.println("Ban muon them gi?");
        System.out.println("\t1.Point   2.Line   3.Circle   4.Rectangular\n");
        int chon;
        do{
            chon = new Scanner(System.in).nextInt();
            if( (chon<1) || (chon>4) ) {
                System.out.println("Chon tu 1-4. Hay chon lai!    ");
            }
        }while ( (chon<1) || (chon>4) );
        switch ( chon ) {
            case 1: a = new Point(1,1); break;
            case 2: a = new Line(new Point(1,1),new Point(3,2)); break;
            case 3: a = new Circle(new Point(0,0),5); break;
            case 4: a = new Rectangular(3,4,5);
        }
        Add(a);
    }
}
