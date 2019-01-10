import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Addition {
    public void add(BigDecimal firstNumber, BigDecimal secondNumber){
        try {
            firstNumber = firstNumber.add(secondNumber);
            Program.firstNumber = firstNumber;
            System.out.println(firstNumber);
        }catch (InputMismatchException ex){
            System.out.println("Podałeś zły znak, tylko liczby!");
        }
    }
}
