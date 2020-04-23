public class Human {

    int age;
    String fio;
    String color;
    boolean married;


        Human(int age, String fio, String color, boolean married) {
             this.age = age;
             this.fio = fio;
             this.color = color;
             this.married = married;
    }

    void printToConsole() {
        System.out.println(age);
        System.out.println(fio);
        System.out.println(color);

        if (this.married = true) {
            System.out.println("He/She has married");
        }
        else {
            System.out.println("He/She n't married");
        }
    }

    void Marrige() {
            this.married = true;
        System.out.println("He/She has married");
          }

     void Alone(){
            this.married = false;
         System.out.println("He/She n't married");
     }
    }



