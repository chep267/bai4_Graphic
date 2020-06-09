package bai_th4_b1;

import java.util.Scanner;

public class TestComposition {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int x1 =0, y1 = 0, x2=0, y2=0;
        System.out.print("\nNhap toa do diem 1: ");
        x1 = sc.nextInt(); y1 = sc.nextInt();
        System.out.print("\nNhap toa do diem 2: ");
        x2 = sc.nextInt(); y2 = sc.nextInt();

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        System.out.print("\nDiem thu 1 la ("+p1.x+","+p1.y+")");
        System.out.print("\nDiem thu 2 la ("+p2.x+","+p2.y+")");
        System.out.print("\nDuong thang tao boi 2 diem tren la: ");
        Line l = new Line(p1,p2);
        int r=0;
        System.out.print("\nNhap ban kinh hinh tron: ");
        r = sc.nextInt();
        Circle c = new Circle(p1,r);
        System.out.print("\nDiem thu 2 ");
        c.Add(p2);
    }
}
