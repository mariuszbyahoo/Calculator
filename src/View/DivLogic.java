package View;

import Actions.Division;
import App.Calculation;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;

public class DivLogic extends ActionLogic {
    @Override
    public void action(DecimalFormat nf, String numberTwo) {
        numberTwo = View.textField.getText();
        Division division = new Division();
        Calculation.secondNumber = (BigDecimal) nf.parse(numberTwo, new ParsePosition(0));
        View.textArea.append(Calculation.secondNumber.toString() + "\n=\n");
        division.div(Calculation.firstNumber, Calculation.secondNumber);
        View.textArea.append(Calculation.firstNumber.toString() + "\n");
        View.textField.setText(Calculation.firstNumber.toString());
    }
}
