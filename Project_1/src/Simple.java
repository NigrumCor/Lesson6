public class Simple {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 10);

        System.out.println(n);

        boolean simple = true;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                simple = false;
                break;
            }
        }
        if (simple) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не является простым");
        }
    }
}
