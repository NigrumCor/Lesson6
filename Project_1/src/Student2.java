public class Student2 extends Human{

    int course;

    Student2(int age, String fio, String color, boolean married, int course) {
        super(age, fio, color, married);
    }
    void studedIn(){
        System.out.println("He is at 1st course");
    }
}

