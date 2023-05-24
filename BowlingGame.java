import javax.swing.JOptionPane;

class TheBowlingGame {
    public static void main(String[] args) {
        final int NUM_TRIES = 3;
        int player1Score = 0;
        int player2Score = 0;
        
        for (int i = 1; i <= NUM_TRIES; i++) {
            String input = JOptionPane.showInputDialog(null, "Player 1 score for attempt #" + i + ":");
            int player1AttemptScore = Integer.parseInt(input);
            player1Score += player1AttemptScore;
            
            input = JOptionPane.showInputDialog(null, "Player 2 score for attempt #" + i + ":");
            int player2AttemptScore = Integer.parseInt(input);
            player2Score += player2AttemptScore;
        }
        
        String winnerMsg;
        if (player1Score > player2Score) {
            winnerMsg = "Player 1 wins with a score of " + player1Score;
        } else if (player2Score > player1Score) {
            winnerMsg = "Player 2 wins with a score of " + player2Score;
        } else {
            winnerMsg = "It's a tie! Both players scored " + player1Score;
        }
        
        JOptionPane.showMessageDialog(null, winnerMsg);
    }
}
// CSA121 - DANIEL JOHN HENRICK D. SANCHEZ