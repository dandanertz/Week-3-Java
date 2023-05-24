import javax.swing.JOptionPane;

public class OwnerValidation {
    public static void main(String[] args) {
        // Get input from user
        String firstName = JOptionPane.showInputDialog("Enter your first name:");

        // Check if user's name matches owner's name
        if (firstName.equalsIgnoreCase("Mart") || firstName.equalsIgnoreCase("Anne")) {
            JOptionPane.showMessageDialog(null, firstName + " is the owner.");
        } else {
            JOptionPane.showMessageDialog(null, firstName + " is the owner of nothing.");
        }
    }
}
//CSA121 - DANIEL JOHN HENRICK D. SANCHEZ
