package Actions;

import App.Calculation;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Exponentiation {
    public void exp (BigDecimal firstNumber , BigDecimal secondNumber){
        try {
            int index = secondNumber.intValue();
            BigDecimal result = firstNumber;
            for (int i = 1; i < index; i++) {
                result = result.multiply(firstNumber);
            }
            Calculation.firstNumber = result;
            System.out.println("Result: " + result);
        }catch (InputMismatchException ex){
            System.out.println("You gave a wrong character, it must be a number!");
        }
    }
}
