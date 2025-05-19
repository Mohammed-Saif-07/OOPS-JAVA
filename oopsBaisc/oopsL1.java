
class Pen{
    String color;
    String type;

public void write(){
    System.out.println("writing");
}
public void printColor(){
    System.out.println(this.color);
}
public void tellType(){
    System.out.println(this.type);
}
}

public class oopsL1{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ball";
        // System.out.println();
        // pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Gel";

        pen2.printColor();
        pen2.tellType();
    }
}