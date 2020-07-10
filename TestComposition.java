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

        Shape a = null;
        System.out.print("\nBan muon them gi?");
        System.out.print("\n\t1.Point   2.Line   3.Circle   4.Rectangular\n");
        int chon;
        do{
            chon = new Scanner(System.in).nextInt();
            if(chon<1 || chon>4){
                System.out.print("\nChon tu 1-4. Hay chon lai!");
            }
        }while (chon<1 || chon>4);
        switch (chon){
            case 1: a = new Point(1,1); break;
            case 2: a = new Line(new Point(0,1),new Point(3,2)); break;
            case 3: a = new Circle(new Point(0,1),5);
            case 4: a = new Rectangular(3,4,5);
        }
        gr.Add(a);

        System.out.print("\ndanh sach cac hinh trong graphic:\n");
        gr.in();

    }
}
