import javax.swing.JOptionPane;

public class DevelopmentalTask {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter your age:");
        int age = Integer.parseInt(input);
        
        String stageMsg;
        if (age < 0) {
            stageMsg = "Invalid age entered.";
        } else if (age < 2) {
            stageMsg = "Infancy - learning to trust.";
        } else if (age < 6) {
            stageMsg = "Early Childhood - learning to take initiative.";
        } else if (age < 12) {
            stageMsg = "Middle Childhood - developing competence.";
        } else if (age < 18) {
            stageMsg = "Adolescence - developing identity.";
        } else if (age < 40) {
            stageMsg = "Early Adulthood - establishing intimacy.";
        } else if (age < 65) {
            stageMsg = "Middle Adulthood - fulfilling life goals.";
        } else if (age < 80) {
            stageMsg = "Late Adulthood - looking back on life.";
        } else {
            stageMsg = "Old Age - coping with loss and change.";
        }
        
        JOptionPane.showMessageDialog(null, "Your age falls under the following stage: " + stageMsg);
    }
}
// CSA121 - DANIEL JOHN HENRICK D. SANCHEZ