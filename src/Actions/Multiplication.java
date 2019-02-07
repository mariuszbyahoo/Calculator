package Actions;

import App.Calculation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;

public class Multiplication {
    public void multi (BigDecimal firstNumber , BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.multiply(secondNumber);
            Calculation.firstNumber = firstNumber;
            System.out.println("Result: " + firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("Podałeś zły znak, tylko liczby!");
        }
    }
}
