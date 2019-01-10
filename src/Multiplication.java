import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Multiplication {
    public void multi (BigDecimal firstNumber , BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.multiply(secondNumber);
            Program.firstNumber = firstNumber;
            System.out.println("Result: " + firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("Podałeś zły znak, tylko liczby!");
        }
    }
}
