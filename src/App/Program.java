package App;

import Actions.*;
import View.View;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  first project, needs more OOP 
 */

public class Program {
    public static BigDecimal firstNumber = BigDecimal.valueOf(0);
    public static BigDecimal secondNumber = BigDecimal.valueOf(0);

    public static void main(String [] args) {
        View.createGUI();
        String info = "\nPossible options: + , - , * , / , ^, after applying 'C' the calculator will be restarted.";

        Scanner input = new Scanner(System.in);

        boolean error = true;
        System.out.println("First number:");
        try {
            firstNumber = BigDecimal.valueOf(input.nextDouble());
        } catch (InputMismatchException ex) {
            System.out.println("You gave a wrong character, it must be a number!");
        }
        System.out.println(info);
        while (error) {
            try {
                switch (input.nextLine()) {
                    case "+":
                        System.out.println("Second element: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Addition addition = new Addition();
                        addition.add(firstNumber, secondNumber);
                        break;
                    case "-":
                        System.out.println("Subtrahend: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Subtraction subtraction = new Subtraction();
                        subtraction.sub(firstNumber,secondNumber);
                        break;
                    case "*":
                        System.out.println("Multiplying factor: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Multiplication multiplication = new Multiplication();
                        multiplication.multi(firstNumber , secondNumber);
                        break;
                    case "/":
                        System.out.println("Divisor: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Division division = new Division();
                        division.div(firstNumber , secondNumber);
                        break;
                    case "^":
                        System.out.println("Actions.Exponentiation index: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Exponentiation exponentiation = new Exponentiation();
                        exponentiation.exp(firstNumber , secondNumber);
                        break;
                    case "C":
                        ResetCalc resetCalc = new ResetCalc();
                        resetCalc.reset();
                        System.out.println("First number: ");
                        Program.firstNumber = BigDecimal.valueOf(input.nextDouble());
                        break;
                    default:
                        System.out.println("Wrong Character, select the Operation's character: + , - , * , / , ^ or 'C'");
                        break;
                }
            }catch(InputMismatchException ex){
                System.out.println("You gave a wrong character, one more time!");
            }
        }
        input.close();
    }
}