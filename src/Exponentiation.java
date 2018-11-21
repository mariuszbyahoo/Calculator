import java.util.Scanner;

public class Exponentiation {
    public void exp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj podstawę potęgi: ");
        double baseOfThePower = input.nextDouble();
        System.out.println("Podaj wykładnik potęgi: ");
        double indicator = input.nextDouble();

        if(baseOfThePower == 0 && indicator == 0){
            System.out.println("Zdefiniowanie potęgi 0^0 sprawia problemy.");
            System.out.println("Z jednej strony można by ją przedstawić jako a^0 i rozszerzyć wartość na 1.");
            System.out.println("I w tym przypadku wynikiem będzie liczba 1.");
            System.out.println("Z drugiej strony 0^n=0, dla wszelkich niezerowych n. Druga wersja,");
            System.out.println("nie została przyjęta, ponieważ funkcja f(x)=0x ma niewielkie znaczenie.");
            System.out.println("Natomiast za przyjęciem wartości 0^0=1 istnieje sporo argumentów.");
            System.out.println("W analizie matematycznej przyjmuje się, że 0^0 jest symbolem nieoznaczonym.");
            System.out.println("Źródło: http://www.math.edu.pl/potegowanie");
            System.out.println("\nWięc możemy się umówić, że wynikiem jest 1.");
        }else{
            System.out.print("Wynik potęgowania to: ");
            System.out.print(Math.pow(baseOfThePower,indicator));
        }
    }
}
