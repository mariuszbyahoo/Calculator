import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Subtraction {
    public void sub (BigDecimal firstNumber, BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.subtract(secondNumber);
            Program.firstNumber = firstNumber;
            System.out.println("Wynik: " + firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("Podałeś zły znak, tylko liczby!");
        }
    }
}
