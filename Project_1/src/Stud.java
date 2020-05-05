    public class Stud extends Human{

        int course;

        Stud(int age, String fio, String color, boolean married, int course) {

            super(age, fio, color, married);
            this.course = course;
        }


        void studedIn(){
            if (this.course > 0 && this.course < 4) {
                System.out.println("He/She is study");
            }
            else {
                System.out.println("He/She n't study");
            }
        }
    }
