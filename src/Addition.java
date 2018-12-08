import java.util.InputMismatchException;

public class Addition {
    public void add(double firstNumber, double secondNumber){
        try {
            firstNumber += secondNumber;
            Program.firstNumber = firstNumber;
        }catch (InputMismatchException ex){
            System.out.println("Podałeś zły znak, tylko liczby!");
        }
    }
}
