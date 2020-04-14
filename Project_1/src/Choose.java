import java.util.Scanner;

public class Choose {


    public static void main(String[] args) {
        int [] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кличество");
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Введите a[" + 1 + "] =");
            a[i] = in.nextInt ();
        }
        do {
            System.out.println( n / 2);
            System.out.println("Только это количество делится на 2");
        }
        while (n <= 0);

    }
}