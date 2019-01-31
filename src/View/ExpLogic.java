package View;

import Actions.Exponentiation;
import App.Calculation;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;

public class ExpLogic extends ActionLogic {
    @Override
    public void action(DecimalFormat nf, String numberTwo) {
        numberTwo = View.textField.getText();
        Exponentiation exponentiation = new Exponentiation();
        Calculation.secondNumber = (BigDecimal) nf.parse(numberTwo, new ParsePosition(0));
        View.textArea.append(Calculation.secondNumber.toString() + "\n=\n");
        exponentiation.exp(Calculation.firstNumber, Calculation.secondNumber);
        View.textArea.append(Calculation.firstNumber.toString() + "\n");
        View.textField.setText(Calculation.firstNumber.toString());
    }
}
