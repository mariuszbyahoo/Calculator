package View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JPanel implements ActionListener {
    public static JTextField textField;
    public static JTextArea textArea;
    static Action action;
    static JFrame frame = new JFrame("Calculator");
    String newLine = "\n";

    public View() {
        textField = new JTextField(10);
        textField.addActionListener(this);

        textArea = new JTextArea("Here's the result: \n", 3, 10);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(textField, BorderLayout.WEST);
        frame.add(scrollPane, BorderLayout.EAST);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        textArea.append(text + newLine);
        textField.selectAll();

        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public void createAndShowGUI() {
        ButtonPanel buttonPanel = new ButtonPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(buttonPanel);

        frame.add(new View());

        frame.pack();
        frame.setVisible(true);
    }

    public void run() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
