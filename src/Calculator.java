public class Calculator {
    static String problem;
    static double a;
    static double b;

    static void start() {
        System.out.println("Input the problem to solve in one line:");
        problem = Input.input();
        System.out.println("problem now is - " + problem);
        doCalc();

    }

    static void doCalc() {
        double result = 0;
        try {
            a = Double.parseDouble(problem.split("[\\+\\-\\*\\/]")[0]);
            b = Double.parseDouble(problem.split("[\\+\\-\\*\\/]")[1]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input. Try again with digits, +, -, /, *");
        }
        for (String s: problem.split("\\d")) {
            if (!s.equals("")) {
                switch (s) {
                    case ("*"):
                        result = Operations.multiplication(a, b);
                        break;
                    case ("/"):
                        result = Operations.divide(a, b);
                        break;
                    case ("-"):
                        result = Operations.sub(a, b);
                        break;
                    case ("+"):
                        result = Operations.add(a, b);
                        break;
                    default:
                        System.out.println("Can't find operation");
                }
                System.out.println("result: " + result);
                System.exit(0);
            }
        }




    }
}
