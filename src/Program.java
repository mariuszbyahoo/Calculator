import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static double firstNumber = 0;
    public static double secondNumber = 0;
    public static void main(String [] args){

        String info = "\nMożliwe działania: + , - , * , / , ^";

        Scanner input = new Scanner(System.in);

        boolean error = true;
        System.out.println("Pierwsza liczba:");
        firstNumber = input.nextDouble();
        while (error) {
            System.out.println(info);
            try {
                switch (input.next()) {
                    case "+":
                        System.out.println("Drugi składnik sumy: ");
                        secondNumber = input.nextDouble();
                        Addition addition = new Addition();
                        addition.add(firstNumber, secondNumber);
                        break;
                    case "-":
                        System.out.println("Odjemnik: ");
                        secondNumber = input.nextDouble();
                        Subtraction subtraction = new Subtraction();
                        subtraction.sub(firstNumber,secondNumber);
                        break;
                    case "*":
                        System.out.println("Czynnik mnożenia: ");
                        secondNumber = input.nextDouble();
                        Multiplication multiplication = new Multiplication();
                        multiplication.multi(firstNumber , secondNumber);
                        break;
                    case "/":
                        System.out.println("Dzielnik: ");
                        secondNumber = input.nextDouble();
                        Division division = new Division();
                        division.div(firstNumber , secondNumber);
                        break;
                    case "^":
                        System.out.println("Wykładnik potęgi: ");
                        secondNumber = input.nextDouble();
                        Exponentiation exponentiation = new Exponentiation();
                        exponentiation.exp(firstNumber , secondNumber);
                }
                System.out.println("Wynik: " + firstNumber);
                // i teraz nie wiedzieć czemu opcja "catch" nie działa
            }catch(InputMismatchException ex){
                System.out.println("Podałeś zły znak, spróbuj jeszcze raz!");
            }
        }
        input.close();
    }
}