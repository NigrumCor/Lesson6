public class Hum {

        int age;
        String fio;
        String color;
        boolean married;


        Hum(int age, String fio, String color, boolean married) {
            this.age = age;
            this.fio = fio;
            this.color = color;
            this.married = married;
        }

        void printToConsole() {
            System.out.println(age);
            System.out.println(fio);
            System.out.println(color);
        }

        void Marrige() {
            if (this.married == true) {

                System.out.println("He/She has married");
            } else {

                System.out.println("He/She n't married");
            }
        }
    }