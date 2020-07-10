package bai4;

import java.util.ArrayList;

public class Graphic extends Shape{
    int n; //so ptu
    ArrayList<Shape> ds = new ArrayList<Shape>(); //danh sach



    @Override
    void Operation() {
        System.out.print("\nGraphic Operation!");
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

    }
}
