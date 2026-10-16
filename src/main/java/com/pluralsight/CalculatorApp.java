package com.pluralsight;


import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userText;

        System.out.println("Enter the first number: ");
        userText = myScanner.nextLine();
        int firstNumber = Integer.parseInt(userText);

        double firstDouble = Double.parseDouble(userText);
        System.out.println("The first number as a double: " + firstDouble);

        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(myScanner.nextLine());

        String menuPrompt = """
                Possible operation:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option: """;
        System.out.println(menuPrompt);
        String operation = myScanner.nextLine();

        System.out.println("operation: " + operation);
    }
}
