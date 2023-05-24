import javax.swing.JOptionPane;

class MTAExamScores {
    public static void main(String[] args) {
        final int NUM_SCORES = 10;
        double highestScore = Double.MIN_VALUE;
        String highestScoreMsg = "";
        
        for (int i = 1; i <= NUM_SCORES; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter score #" + i + ":");
            double score = Double.parseDouble(input);
            
            if (score > highestScore) {
                highestScore = score;
                highestScoreMsg = "Score #" + i + " is the highest so far.";
            }
        }
        
        JOptionPane.showMessageDialog(null, highestScoreMsg + "\n\nThe highest score is: " + highestScore);
    }
}
//CSA121 - DANIEL JOHN HENRICK D. SANCHEZ