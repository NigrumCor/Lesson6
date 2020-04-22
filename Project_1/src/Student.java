import java.util.Scanner;

public class Student {
    int age;
    String FIO;
    int course;
    int Subjects;
        Student(int age, String FIO, int course) {
        this.age = age;
        this.FIO = FIO;
        this.course = course;

            }

    void printToConsole() {
        System.out.println(age);
        System.out.println(FIO);
        System.out.println(course);
    }

    void onNextCourse() {
        if (this.course > 0 && this.course < 4) {
            this.course++;
            System.out.println(course);
        }
    }
    void inSubjectsOnCourse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество предметов - ");
        Subjects = in.nextInt();
    }

    void getMidMark() {
        int[] Marks = new int[Subjects];
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = (int) (Math.random() * 9) + 1;
            System.out.println(Marks[i]);
        }
        System.out.println("Средний балл");
        double sum = 0;
        for (int i = 0; i < Marks.length; i++) {
            sum += Marks[i];
        }
        double MidMark = sum / Marks.length;
        System.out.println(MidMark);


    }
}



