class Shape{  // base class / parent class
    public void area(){
        System.out.println("display area");
    }
}

// sub class / child class niche
class Triangle extends Shape { // triangle class inherited properties of class shape
    public void area(int l , int h){
        System.out.println(0.5*l*h);
    }
}

class Equalateral extends Triangle{
    public void area(int l , int h){
        System.out.println(0.5*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class inheritance {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        s1.area();              // display area

        Triangle t1 = new Triangle();
        t1.area(2,2);       // 2.0

        Equalateral eq1 = new Equalateral();
        eq1.area(4,8);      //16.0

        Circle c1 = new Circle();
        c1.area(2);           // 12.56
    }
}