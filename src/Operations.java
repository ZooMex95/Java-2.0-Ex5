public class Operations {
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Divide by zero");
            return 0;
        } else return a / b;
    }
}
