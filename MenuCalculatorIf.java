import javax.swing.JOptionPane;
public class MenuCalculatorIf {
    public static void main(String[] args) {
        // Loop until user quits
        while (true) {
            // Get input from user
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));

            // Display menu and get choice from user
            String choice = JOptionPane.showInputDialog(
                "What operation would you like to perform?\n" +
                "[A]dd\n" +
                "[S]ubtract\n" +
                "[M]ultiply\n" +
                "[D]ivide\n" +
                "[Q]uit"
            );

            // Check user choice and perform calculation
            if (choice.equalsIgnoreCase("A")) {
                double result = num1 + num2;
                JOptionPane.showMessageDialog(null, "The sum is " + result);
            } else if (choice.equalsIgnoreCase("S")) {
                double result = num1 - num2;
                JOptionPane.showMessageDialog(null, "The difference is " + result);
            } else if (choice.equalsIgnoreCase("M")) {
                double result = num1 * num2;
                JOptionPane.showMessageDialog(null, "The product is " + result);
            } else if (choice.equalsIgnoreCase("D")) {
                double result = num1 / num2;
                JOptionPane.showMessageDialog(null, "The quotient is " + result);
            } else if (choice.equalsIgnoreCase("Q")) {
                JOptionPane.showMessageDialog(null, "Program terminating...");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice entered.");
            }
        }
    }
}
//CSA21 - DANIEL JOHN HENRICK D. SANCHEZ