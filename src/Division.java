import java.util.InputMismatchException;

public class Division {
    public void div (double firstNumber , double secondNumber){
        try {
            firstNumber /= secondNumber;
            Program.firstNumber = firstNumber;
        }catch (InputMismatchException ex){
            System.out.println("Zły znak, tylko liczby!");
        }
    }
}
