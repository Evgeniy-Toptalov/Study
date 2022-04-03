package FirstQuarter.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HWLesson8 extends JFrame {

    private int counter = 0;

    public HWLesson8() {
        setTitle("CounterApp window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 200);

        Font font = new Font("Arial", Font.BOLD, 30);

        setLayout(new GridLayout(3,3));

        JButton button1 = new JButton("");
            add(button1);
        JButton zeroingButton = new JButton("ZERO");
            add(zeroingButton);
        JButton button3 = new JButton("");
            add(button3);
        JButton decrementButton = new JButton("<");
            add(decrementButton);
        JLabel counterView = new JLabel(String.valueOf(counter));
            counterView.setHorizontalAlignment(SwingConstants.CENTER);
            counterView.setFont(font);
            add(counterView);
        JButton incrementButton = new JButton(">");
            add(incrementButton);
        JButton decrement10Button = new JButton("<<");
            add(decrement10Button);
        JButton button8 = new JButton("");
            add(button8);
        JButton increment10Button = new JButton(">>");
            add(increment10Button);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == incrementButton) {
                    counter++;
                } else if (e.getSource() == decrementButton) {
                    counter--;
                } else if (e.getSource() == zeroingButton) {
                    counter = 0;
                } else if (e.getSource() == increment10Button) {
                    counter += 10;
                } else if (e.getSource() == decrement10Button) {
                    counter -= 10;
                }
                refreshCounterView(counterView);
            }
        };

        incrementButton.addActionListener(actionListener);
        decrementButton.addActionListener(actionListener);
        zeroingButton.addActionListener(actionListener);
        increment10Button.addActionListener(actionListener);
        decrement10Button.addActionListener(actionListener);

        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new HWLesson8();
    }
}
