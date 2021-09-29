import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    static String input() {
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine().replaceAll(" ", "");
    }


}
