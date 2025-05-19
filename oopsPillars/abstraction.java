abstract class Animal{
    abstract void walk(); 
    Animal(){
        System.out.println("created new animal");
    }
    public void eats(){
        System.out.println("animal eats");
    } 
}
// walk naam ka function har kisi class me exist krega

class Horse extends Animal{
    Horse(){
        System.out.println("created new horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        // horse.eats();
        // Animal animal = new Animal(); ----> instantiate error
        // animal.walk();
        
    }
}
// instantiate object animal 
// ham animal ko bana nhi sakte
// kyuki animal bas ek blueprint hai
// actualy nhi create kr sakte 
// run time error when we call class animal

// constructor chaining
// jab bhi ham derived class me constructor banate hai
// sabse pehle base class ka constructor call hota hai fr
// derived class ka