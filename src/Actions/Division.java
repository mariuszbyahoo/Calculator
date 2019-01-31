package Actions;

import App.Calculation;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Division {
    public void div (BigDecimal firstNumber , BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.divide(secondNumber);
            Calculation.firstNumber = firstNumber;
            System.out.println("Result: " + firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("You gave a wrong character, it must be a number!");
        }
    }
}
