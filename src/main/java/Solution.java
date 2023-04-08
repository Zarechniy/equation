import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите уравнение");
        String equation = reader.readLine();

        System.out.println("x=" + solveEquation(equation));
    }

    public static int solveEquation(String equation) {
        int xIndex = equation.indexOf("x");
        int first, second;
        char operation = equation.charAt(1);

        if (xIndex == 0) {
            first = Character.getNumericValue(equation.charAt(2));
            second = Character.getNumericValue(equation.charAt(4));
            return (operation == '+') ? second - first : first - second;
        } else if (xIndex == 2) {
            first = Character.getNumericValue(equation.charAt(0));
            second = Character.getNumericValue(equation.charAt(4));
            return (operation == '+') ? second - first : first + second;
        } else {
            first = Character.getNumericValue(equation.charAt(0));
            second = Character.getNumericValue(equation.charAt(2));
            return (operation == '+') ? first + second : first - second;
        }
    }
}
