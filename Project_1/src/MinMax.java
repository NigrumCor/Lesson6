public class MinMax {
    public static void main(String[] args) {
        double[] A = new double[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 453 + 79;
        }
        double curmax = A[0];
        double curmin = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > curmax) {
                curmax = A[i];
            }
            if (A[i] < curmin) {
                curmin = A[1];
            }
        }
        System.out.println();
        System.out.println("Наибольшее значение в массиве");
        System.out.println(curmax);
        System.out.println();
        System.out.println("Наименьшее значение в массиве");
        System.out.println(curmin);
    }
}
