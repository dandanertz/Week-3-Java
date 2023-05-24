import javax.swing.JOptionPane;

public class PositiveNegative {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a number:");
        double number = Double.parseDouble(input);
        String message;
        if (number > 0) {
            message = "The number is positive.";
        } else if (number < 0) {
            message = "The number is negative.";
        } else {
            message = "The number is zero.";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
// CSA121 - DANIEL JOHN HENRICK D. SANCHEZ