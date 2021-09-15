import java.util.Scanner;

public class MainCalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RomeConvert romeConvert = new RomeConvert();
        romeConvert.operation(scanner.next(), scanner.next().charAt(0), scanner.next());
    }
}