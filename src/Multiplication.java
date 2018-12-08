import java.util.InputMismatchException;

public class Multiplication {
    public void multi (double firstNumber , double secondNumber){
        try {
            firstNumber *= secondNumber;
            Program.firstNumber = firstNumber;
        }catch (InputMismatchException ex){
            System.out.println("Podałeś zły znak, tylko liczby!");
        }
    }
}
