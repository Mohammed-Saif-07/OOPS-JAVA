

interface Animal   {
    int eyes = 2;
    public void walk(); // --> abstract function 
}

interface Herbivore{

}
class Horse implements Animal , Herbivore{   // --> multiple inheritance 
    public void walk(){    // --> used this fucntion
        System.out.println("walks on 4 legs");
    }
}

public class abstractin2 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}

// Interfaces cannot have constructors
// multiple inheritance cannot be done in classes
// only done in interfaces
