package Actions;

import App.Calculation;

import java.math.BigDecimal;

public class ResetCalc {
    public void reset(){
        Calculation.firstNumber = BigDecimal.valueOf(0);
        Calculation.secondNumber = BigDecimal.valueOf(0);
        System.out.println("Calc has been restarted: ");
        System.out.println(Calculation.firstNumber);
    }
}
