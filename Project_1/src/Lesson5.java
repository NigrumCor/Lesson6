public class Lesson5 {
    public static void main(String[] args) {
        Student student = new Student(27, "Bogdanovich Yaroslav Sergeevich",1);

        student.printToConsole();

            System.out.println("Переведен дальше");

        student.onNextCourse();


        student.inSubjectsOnCourse();

            System.out.println("Оценки по предметам");

        student.getMidMark();

    }
}
