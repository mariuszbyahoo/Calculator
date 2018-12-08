import java.util.InputMismatchException;

public class Exponentiation {
    public void exp (double firstNumber , double secondNumber){
        try {
            firstNumber = Math.pow(firstNumber, secondNumber);
            Program.firstNumber = firstNumber;
        }catch (InputMismatchException ex){
            System.out.println("Zły znak, tylko liczby!");
        }
    }
}
