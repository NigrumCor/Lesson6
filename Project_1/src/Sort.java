import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Whrite");
        n = in.nextInt();
        int m = n + 2;

        int[][] mass = new int[n][m];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 10);
                System.out.print(mass[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("Sorted:");

        for(int i = 0; i < mass.length; i++){
            Arrays.sort(mass[i]);
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
