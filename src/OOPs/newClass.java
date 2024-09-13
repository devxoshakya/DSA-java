package OOPs;
/**
 * newClass
 */
public class newClass {

    
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", 20);
        Student s2 = new Student(2, "Doe", 21);
        System.out.println(s1);
        System.out.println(s2.id + " " + s2.name + "  " + s2.age);
    }
}

class Student{
    int id;
    String name;
    int age;
    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}