package View;

import Actions.Addition;
import App.Program;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;

public class AddLogic extends ActionLogic {
    @Override
    public void action(DecimalFormat nf, String numberTwo) {
        numberTwo = View.textField.getText();
        Addition addition = new Addition();
        Program.secondNumber = (BigDecimal) nf.parse(numberTwo, new ParsePosition(0));
        View.textArea.append(Program.secondNumber.toString() + "\n=\n");
        addition.add(Program.firstNumber, Program.secondNumber);
        View.textArea.append(Program.firstNumber.toString() + "\n");
        View.textField.setText(Program.firstNumber.toString());
    }
}
