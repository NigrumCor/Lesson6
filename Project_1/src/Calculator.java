public class Calculator {
    public static void main(String[] args) {
        double a = 2;
        double b = 7;
        double c = 3;
        double d = ((b * b) - (4 * a * c));
        if (d < 0) {
            System.out.println("нет действительных решений");

        } else if (d == 0)
            System.out.println("один действительный корень");
        System.out.println((-b) / (2 * a));
        if (d > 0) {
            System.out.println("имеется два корня");
            System.out.println(((-b) - Math.sqrt(d)) / (2 * a));
            System.out.println(((-b) + Math.sqrt(d)) / (2 * a));
        }


    }
}