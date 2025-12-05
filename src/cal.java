import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels
        JLabel l1 = new JLabel("Enter Number 1:");
        l1.setBounds(30, 30, 150, 30);
        frame.add(l1);

        JLabel l2 = new JLabel("Enter Number 2:");
        l2.setBounds(30, 70, 150, 30);
        frame.add(l2);

        // Text fields
        JTextField t1 = new JTextField();
        t1.setBounds(180, 30, 150, 30);
        frame.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 70, 150, 30);
        frame.add(t2);

        // Dropdown for operations
        String[] ops = {"Addition", "Subtraction", "Multiplication", "Division"};
        JComboBox<String> operation = new JComboBox<>(ops);
        operation.setBounds(120, 120, 150, 30);
        frame.add(operation);

        // Button
        JButton calcBtn = new JButton("Calculate");
        calcBtn.setBounds(130, 170, 120, 40);
        frame.add(calcBtn);

        // Result label
        JLabel result = new JLabel("Result: ");
        result.setBounds(30, 230, 350, 30);
        result.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(result);

        // Button Action
        calcBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(t1.getText());
                    double num2 = Double.parseDouble(t2.getText());

                    calculater obj = new calculater(num1, num2);

                    int selectedOp = operation.getSelectedIndex(); // 0,1,2,3
                    double ans = 0;

                    switch (selectedOp) {
                        case 0: ans = obj.add(); break;
                        case 1: ans = obj.sub(); break;
                        case 2: ans = obj.mul(); break;
                        case 3: ans = obj.div(); break;
                    }

                    result.setText("Result: " + ans);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, 
                        "Please enter valid numbers!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
