import javax.swing.JOptionPane;
class NestedIf{
    public static void main(String[] args) {
        
        // Ask for the day and weather
        String day = JOptionPane.showInputDialog("What day is it today?");
        String weather = JOptionPane.showInputDialog("What's the weather like today? (Sunny, Rainy, Gloomy)");

        // Check the day
        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Thursday")) {
            JOptionPane.showMessageDialog(null, "You have school today.");
        } else if (day.equalsIgnoreCase("Wednesday")) {
            JOptionPane.showMessageDialog(null, "You have school and a date today.");
        } else if (day.equalsIgnoreCase("Friday")) {
            JOptionPane.showMessageDialog(null, "You have school and a party today.");
        } else if (day.equalsIgnoreCase("Saturday")) {
            JOptionPane.showMessageDialog(null, "You're bonding with friends today.");
        } else if (day.equalsIgnoreCase("Sunday")) {
            JOptionPane.showMessageDialog(null, "You're going to church and bonding with family today.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid day entered.");
            return;
        }

        // Check the weather
        if (weather.equalsIgnoreCase("Sunny")) {
            JOptionPane.showMessageDialog(null, "Bring a hat or an umbrella.");
        } else if (weather.equalsIgnoreCase("Rainy")) {
            JOptionPane.showMessageDialog(null, "Bring an umbrella or a raincoat.");
        } else if (weather.equalsIgnoreCase("Gloomy")) {
            JOptionPane.showMessageDialog(null, "Ride a taxi.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid weather entered.");
            return;
        }

        // Done
        JOptionPane.showMessageDialog(null, "Have a good day! Daniel");
    }
}
//CSA121 - DANIEL JOHN HENRICK D. SANCHEZ