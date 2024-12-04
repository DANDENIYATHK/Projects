import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal{
    private JFrame frame;
    private JTextField txtField;
    private double fNumber;
    private String operator;

    public Cal() {
        frame = new JFrame("Cal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setLayout(new BorderLayout());

        txtField = new JTextField();
        txtField.setHorizontalAlignment(JTextField.CENTER);
        txtField.setPreferredSize(new Dimension(300, 50)); 
	txtField.setFont(new Font("Arial Black", Font.PLAIN, 20)); 
	frame.add(txtField, BorderLayout.NORTH);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,5));

        String[] buttonLabels = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", ".", "=", "/",
       		"AC"
	 };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            
            if (Character.isDigit(label.charAt(0))) {
                button.setBackground(Color.YELLOW);  
            } else {
                button.setBackground(Color.GREEN); 
            }

			buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String buttonText = source.getText();

            switch (buttonText) {
                case "=":
                    calculateResult();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    handleOperator(buttonText);
                    break;
		case"AC":
                clearTextField();
		break;
		default:
                    appendToTextField(buttonText);
            }
        }
    }
    private void clearTextField() {
    txtField.setText("");
    fNumber = 0;
    operator=null;
	
}




    private void appendToTextField(String text) {
        String currentText = txtField.getText();
        txtField.setText(currentText + text);
    }

    private void handleOperator(String operator) {
        this.operator = operator;
        String currentText = txtField.getText();
        fNumber = Double.parseDouble(currentText);
        txtField.setText("");
    }

    private void calculateResult() {
        String secondNumberText = txtField.getText();
        double sNumber = Double.parseDouble(secondNumberText);
        double result = 0;

        switch (operator) {
            case "+":
                result = fNumber + sNumber;
                break;
            case "-":
                result = fNumber - sNumber;
                break;
            case "*":
                result = fNumber * sNumber;
                break;
            case "/":
                if (sNumber != 0) {
                    result = fNumber / sNumber;
                } else {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
        }

        txtField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Cal();
            }
        });
    }
}
