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

            String info = "\n\nCo chcesz zrobić; \nDodawać? Wpisz 1\nOdejmować? Wpisz 2\nMnożyć? Wpisz 3\nDzielić? Wpisz 4\n"+
                    "Potęgować? Wpisz 5\nWyjść z programu? Wpisz jakąkolwiek inną liczbę";

            System.out.println(info);

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
                default:
                    System.out.println("Zamykam program, miłego dnia");
                    System.exit(0);
                    break;
            }
/* bazowa forma w najprostszej postaci jeszcze do ulepszenia, obecna przewiduje tylko po dwa składniki działań arytmetycznych.
        brakuje:
        -pętli zapętlającej działanie programu,
        -instrukcji pozwalających na działania na kilku(nastu) składniktach
        -po wybraniu złej liczby w menu, powrót do wyboru opcji (1-5)*/
        }
    }
