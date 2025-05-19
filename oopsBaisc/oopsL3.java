
class Student1{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1(String name , int age){
        this.name = name;
        this.age = age;
    }
}

public class oopsL3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("saif",20);
        s1.printInfo();
    }
}
