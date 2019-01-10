import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static BigDecimal firstNumber = BigDecimal.valueOf(0);
    public static BigDecimal secondNumber = BigDecimal.valueOf(0);
    public static void main(String [] args) {

        String info = "\nMozliwe dzialania: + , - , * , / , ^, po wpisaniu wielkiego 'C' nastapi wyzerowanie kalkulatora";

        Scanner input = new Scanner(System.in);

        boolean error = true;
        System.out.println("Pierwsza liczba:");
            try {
                firstNumber = BigDecimal.valueOf(input.nextDouble());
            } catch (InputMismatchException ex) {
                System.out.println("Podałes zly znak, Podaj dowolna liczbę!");
            }
        System.out.println(info);
        while (error) {
            try {
                switch (input.nextLine()) {
                    case "+":
                        System.out.println("Drugi skladnik sumy: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Addition addition = new Addition();
                        addition.add(firstNumber, secondNumber);
                        break;
                    case "-":
                        System.out.println("Odjemnik: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Subtraction subtraction = new Subtraction();
                        subtraction.sub(firstNumber,secondNumber);
                        break;
                    case "*":
                        System.out.println("Czynnik mnozenia: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Multiplication multiplication = new Multiplication();
                        multiplication.multi(firstNumber , secondNumber);
                        break;
                    case "/":
                        System.out.println("Dzielnik: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Division division = new Division();
                        division.div(firstNumber , secondNumber);
                        break;
                    case "^":
                        System.out.println("Wykładnik potegi: ");
                        secondNumber = BigDecimal.valueOf(input.nextDouble());
                        Exponentiation exponentiation = new Exponentiation();
                        exponentiation.exp(firstNumber , secondNumber);
                        break;
                    case "C":
                        ResetCalc resetCalc = new ResetCalc();
                        resetCalc.reset();
                        System.out.println("Podaj pierwsza liczbe: ");
                        Program.firstNumber = BigDecimal.valueOf(input.nextDouble());
                        break;
                    default:
                        System.out.println("Podaj znak dzialania");
                        break;
                }
            }catch(InputMismatchException ex){
                System.out.println("Podałes zly znak, sprobuj jeszcze raz!");
            }
        }
        input.close();
    }
}