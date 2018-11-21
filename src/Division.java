import java.util.Scanner;

class Division {
    public void div(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dzielną: ");
        double dividend = input.nextDouble();
        System.out.println("Podaj dzielnik: ");
        double divisor = input.nextDouble();
        if(divisor != 0) {
            System.out.print("Wynik dzielenia to: ");
            System.out.print(dividend / divisor);
        }else{
            System.out.println("Nie można dzielić przez 0!");
        }
    }
}
