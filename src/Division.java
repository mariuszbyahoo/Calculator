import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Division {
    public void div (BigDecimal firstNumber , BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.divide(secondNumber);
            Program.firstNumber = firstNumber;
            System.out.println("Wynik: " + firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("Zły znak, tylko liczby!");
        }
    }
}
