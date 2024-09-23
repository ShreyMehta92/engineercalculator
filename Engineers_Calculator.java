import java.awt.*;
import java.awt.event.*;

public class Engineers_Calculator {
    private Frame frame;
    private TextField input1, input2, result;
    private Choice operations;

    public Engineers_Calculator() {
        frame = new Frame("Engineers Calculator");
        Label label1 = new Label("First Number:");
        input1 = new TextField(10);
        Label label2 = new Label("Second Number:");
        input2 = new TextField(10);
        operations = new Choice();
        operations.add("Addition");
        operations.add("Subtraction");
        operations.add("Multiplication");
        operations.add("Division");
        operations.add("Square Root");
        operations.add("Sine");
        operations.add("Cosine");
        operations.add("Tangent");
        operations.add("Exponentiation");
        operations.add("Logarithm (base 10)");
        operations.add("Factorial");
        
        Button calculateButton = new Button("Calculate");
        result = new TextField(20);
        result.setEditable(false);
        
        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(input1);
        frame.add(label2);
        frame.add(input2);
        frame.add(operations);
        frame.add(calculateButton);
        frame.add(new Label("Result:"));
        frame.add(result);
    
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
        
        frame.setSize(400, 300);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    private void calculateResult() {
        String operation = operations.getSelectedItem();
        double num1 = Double.parseDouble(input1.getText());
        double num2 = Double.parseDouble(input2.getText());
        double res = 0;

        switch (operation) {
            case "Addition":
                res = num1 + num2;
                break;
            case "Subtraction":
                res = num1 - num2;
                break;
            case "Multiplication":
                res = num1 * num2;
                break;
            case "Division":
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    result.setText("Error: Division by zero");
                    return;
                }
                break;
            case "Square Root":
                if (num1 >= 0) {
                    res = Math.sqrt(num1);
                } else {
                    result.setText("Error: Negative input");
                    return;
                }
                break;
            case "Sine":
                res = Math.sin(num1);
                break;
            case "Cosine":
                res = Math.cos(num1);
                break;
            case "Tangent":
                res = Math.tan(num1);
                break;
            case "Exponentiation":
                res = Math.pow(num1, num2);
                break;
            case "Logarithm (base 10)":
                if (num1 > 0) {
                    res = Math.log10(num1);
                } else {
                    result.setText("Error: Non-positive input");
                    return;
                }
                break;
            case "Factorial":
                if (num1 >= 0 && num1 % 1 == 0) {
                    res = factorial((int) num1);
                } else {
                    result.setText("Error: Non-negative integer required");
                    return;
                }
                break;
        }
        result.setText(String.valueOf(res));
    }

    private long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        new Engineers_Calculator();
    }
}
