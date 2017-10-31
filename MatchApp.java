import javafx.css.Match;

import java.util.Scanner;

public class MatchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите выражение для вычисления (например: 8 / 4):");

        double firstNumber = in.nextDouble();
        String matchOperation = in.next();
        double secondNumber = in.nextDouble();

        switch (matchOperation) {
            case "+":
                System.out.println("Результат вычисления:" + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Результат вычисления:" + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Результат вычисления:" + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("Результат вычисления:" + (firstNumber / secondNumber));
                break;
            case "%":
                System.out.println("Результат вычисления:" + (firstNumber % secondNumber));
                break;

        }
    }
}
