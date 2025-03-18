package src;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAns = 0;
        System.out.println("The correct guess would be:" + computerNumber );
        int count = 1;
        while(userAns != computerNumber){
            String response = JOptionPane.showInputDialog(null,"Enter a number between 1 and 100", "GuessingGame",3);
            userAns = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null,"" + determineGuess(userAns,computerNumber,count));
            count++;
        }
    }

    public static String determineGuess(int userAns, int computerNumber, int count){
        if(userAns <= 0 || userAns > 100)
            return "Invalid Guess";
        else if (userAns == computerNumber)
            return "Correct! \n Total Guess:" + count;
        else if (userAns > computerNumber)
            return "Your Guess is too high, try again \n Try Number:" + count;
        else return "Your Guess is too low, try again \n Try Number:" + count;
    }
}