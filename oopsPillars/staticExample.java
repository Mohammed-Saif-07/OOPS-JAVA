// static means jo ek class ke lie common hai

class Student3{
    String name;
    static String school;
}
public class staticExample {
    public static void main(String[] args) {
        Student3.school = "aksips";   // --> due to static 
        Student3 student = new Student3();
        student.name = "saif";        // --> its not static 
        System.out.println(student.school);
    }
}
 // static chizo ko ham acces kr sakte hai
 // kyuli vo class ki chize hai object ki 
 // chize nhi hai
 // static hm un chizo ko banate hai jinhe ham chahte hai vo common rahe
 // static chizo ko memory ek hi baar di jati hai
 // object ko memory baar baar di jati  hai

// example: object = name -> String name we have created in class