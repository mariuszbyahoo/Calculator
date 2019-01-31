package Actions;

import App.Calculation;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Addition {
    public void add(BigDecimal firstNumber, BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.add(secondNumber);
            Calculation.firstNumber = firstNumber;
            System.out.println("Result: " + firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("You gave a wrong character, it must be a number, select the Opration's Character: !");
        }
    }
}
