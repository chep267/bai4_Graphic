package bai4;

import java.util.Scanner;

public class TestComposition {
    public static void main(String[] args) {
        Graphic gr = new Graphic();

        gr.Operation();

        gr.ds.add(new Point(1,1));
        gr.ds.add(new Line(new Point(0,1),new Point(3,2)));
        gr.ds.add(new Circle(new Point(0,1),5));
        gr.ds.add(new Rectangular(3,4,5));

        for(Shape a : gr.ds){
            a.Operation();
        }

        gr.themhinh();

        System.out.print("\ndanh sach cac hinh trong graphic:\n");
        gr.in();

    }
}
