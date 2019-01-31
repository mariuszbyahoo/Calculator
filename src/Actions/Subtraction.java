package Actions;

import App.Calculation;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Subtraction {
    public void sub (BigDecimal firstNumber, BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.subtract(secondNumber);
            Calculation.firstNumber = firstNumber;
            System.out.println("Result: " + firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("You gave a wrong character, it must be a number!");
        }
    }
}
