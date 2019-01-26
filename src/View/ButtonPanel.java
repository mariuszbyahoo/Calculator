package View;

import App.Program;
import Actions.Addition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class ButtonPanel extends JMenuBar implements ActionListener {
    private static final int HEIGHT = 50;
    private static final int WIDTH = 100;
    private String numberOne;
    private String numberTwo;
    private JButton addButton;
    private JButton subButton;
    private JButton multiButton;
    private JButton divButton;
    private JButton expButton;
    private JButton cButton;
    private JButton equalsButton;
    DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();

    public ButtonPanel() {
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        expButton = new JButton("^");
        cButton = new JButton("C");
        equalsButton = new JButton("=");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiButton.addActionListener(this);
        divButton.addActionListener(this);
        expButton.addActionListener(this);
        cButton.addActionListener(this);
        equalsButton.addActionListener(this);

        setBorderPainted(true);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(addButton);
        add(subButton);
        add(multiButton);
        add(divButton);
        add(expButton);
        add(cButton);
        add(equalsButton);

    }

    /**
     * Metoda działa; przechodzi przez Program.firstNumber i teraz trzeba zrobić dalej, tak by wywoływała metody już z pakietu Actions.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addButton) {
            numberOne = View.textField.getText();
            View.textField.setText(null);

            nf.setParseBigDecimal(true);
            Program.firstNumber = (BigDecimal) nf.parse(numberOne, new ParsePosition(0));
            View.textArea.append(Program.firstNumber.toString() + "\n+\n");
            View.action = Action.ADD;
        } else if (source == subButton) {

        } else if (source == multiButton) {

        } else if (source == divButton) {

        } else if (source == expButton) {

        } else if (source == cButton) {

        } else if (source == equalsButton) {
            if (View.action != null && !View.textField.equals(null)) {
                switch (View.action) {
                    case ADD:
                        addition(nf);
                        break;
                    case SUB:

                    case MULTI:

                    case DIV:

                    case EXP:

                    case C:
                }
            }
        }
    }

    private void addition(DecimalFormat nf) {
        numberTwo = View.textField.getText();
        Addition addition = new Addition();
        Program.secondNumber = (BigDecimal) nf.parse(numberTwo, new ParsePosition(0));
        View.textArea.append(Program.secondNumber.toString() + "\n=\n");
        addition.add(Program.firstNumber, Program.secondNumber);
        View.textArea.append(Program.firstNumber.toString() + "\n");
    }
}
