import java.util.Scanner;

public class Program {

        private final int ADDITION = 1;
        private final int SUBTRACTION = 2;
        private final int MULTIPLICATION = 3;
        private final int DIVISION = 4;
        private final int EXPONENTIATION = 5;
        private final int EXIT_PROGRAMME = 0;

        public static void main(String [] args){

            Scanner input = new Scanner(System.in);

            System.out.println("Co chcesz zrobić;");
            System.out.println("Dodawać? Wpisz 1");
            System.out.println("Odejmować? Wpisz 2");
            System.out.println("Mnożyć? Wpisz 3");
            System.out.println("Dzielić? Wpisz 4");
            System.out.println("Potęgować? Wpisz 5");
            System.out.println("Wyjść z programu? Wpisz 0");

            int choice = input.nextInt();

            switch (choice){
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
                case 0:
                    break;
                default:
                    System.out.println("Zły wybór, jeszcze raz");
                    break;
            }
/* bazowa forma w najprostszej postaci jeszcze do ulepszenia, obecna przewiduje tylko po dwa składniki działań arytmetycznych.
        brakuje:
        -pętli zapętlającej działanie programu,
        -instrukcji pozwalających na działania na kilku(nastu) składniktach*/
        }
    }
