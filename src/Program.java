import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static double result = 0;
    public static void main(String [] args){

        String info = "\n\nCo chcesz zrobić; \nDodawać? Wpisz 1\nOdejmować? Wpisz 2\nMnożyć? Wpisz 3\nDzielić? Wpisz 4\n"+
                "Potęgować? Wpisz 5\n Wyjść z programu? Wciśnij cyfrę od 6 do 9 lub 0";

        String info2 = "\nAby liczyć, wpisz 1, inny wybór to wyjście z programu.";

        Scanner input = new Scanner(System.in);

        boolean error = true;
        System.out.println(info2);

        while (error) {
            System.out.println(info);
            try {
                switch (input.nextInt()) {
                    case 1:
                        Addition addition = new Addition();
                        addition.add();
                        break;
                    case 2:
                        Subtraction subtraction = new Subtraction();
                        subtraction.sub();
                        break;
                    case 3:
                        Multiplication multiplication = new Multiplication();
                        multiplication.multi();
                        break;
                    case 4:
                        Division division = new Division();
                        division.div();
                        break;
                    case 5:
                        Exponentiation exponentiation = new Exponentiation();
                        exponentiation.exp();
                        break;
                }
                System.out.println(info2);
                if(input.nextInt() == 1) {
                    error = true;
                }
                else{
                    error = false;
                }
            }catch(InputMismatchException ex){
                System.out.println("Podałeś zły znak, spróbuj jeszcze raz!");
            }
        }
        input.close();
    }
}