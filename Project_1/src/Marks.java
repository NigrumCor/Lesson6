public class Marks {
    public static void main(String[] args) {
        int m = 10;

        int[] Marks = new int[m];
        for (int i = 0; i < Marks.length; i++){

                Marks[i] = (int) (Math.random() * 10);
                System.out.println(Marks[i]);
        }
        System.out.println("Mid Mark");
        double sum = 0;
        for (int i = 0; i < Marks.length; i++){
            sum += Marks[i];
        }
        double MidMark = sum/Marks.length;
        System.out.println(MidMark);
        }

    }

