package View;

import App.Program;

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
    private String txt;
    private Double parsedNumber;
    private JButton addButton;
    private JButton subButton;
    private JButton multiButton;
    private JButton divButton;
    private JButton expButton;
    private JButton cButton;
    private JButton equalsButton;

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
            txt = View.textField.getText();

            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setParseBigDecimal(true);

            Program.firstNumber = (BigDecimal) nf.parse(txt, new ParsePosition(0));

            View.textArea.append(Program.firstNumber.toString() + "\n+\n");
        }
        if (source == subButton) {

        }
        if (source == multiButton) {

        }
        if (source == divButton) {

        }
        if (source == expButton) {

        }
        if (source == cButton) {

        }
        if (source == equalsButton) {

        }
    }
}
