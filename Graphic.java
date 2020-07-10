package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Graphic extends Shape{
    int n; //so ptu
    ArrayList<Shape> ds = new ArrayList<Shape>(); //danh sach



    @Override
    void Operation() {
        System.out.print("\nGraphic Operation!");
    }

    @Override
    void Add(Shape a) {
        ds.add(a);
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
        for(Shape a: ds){
            a.in();
            System.out.print("\n");
        }
    }
}
