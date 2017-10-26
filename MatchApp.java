import javafx.css.Match;

import java.util.Scanner;

public class MatchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        String matchOperation;

        System.out.print("Введите выражение для вычисления (например: 8 / 4):");

        firstNumber = in.nextDouble();
        matchOperation = in.next();
        secondNumber = in.nextDouble();

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
