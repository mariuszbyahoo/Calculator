import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Exponentiation {
    public void exp (BigDecimal firstNumber , BigDecimal secondNumber){
        try {
            int index = secondNumber.intValue();
            BigDecimal result = firstNumber;
            for(int i = 0; i < index ; i++) {
                result = result.multiply(firstNumber);
            }
            Program.firstNumber = result;
            System.out.println("Result: " + result);
        }catch (InputMismatchException ex){
            System.out.println("You gave a wrong character, it must be a number!");
        }
    }
}
