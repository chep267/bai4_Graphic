package dongcode.bai4;

public abstract class Shape {

    abstract void Operation();

    abstract void Add(Shape a);

    abstract void Remove(Shape a);

    abstract void GetChild(Shape a);

    abstract void in();

    abstract Shape CopyConstructor();

    abstract Shape Clone();

    abstract String ten();
}


