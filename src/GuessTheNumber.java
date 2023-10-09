import javax.swing.*;

public class GuessTheNumber
{

    public static void main(String[] args)
    {
        int gen = (int)(Math.random()*20+1);
        System.out.println(gen);

        for (int guessnr = 1; guessnr <=10;)
        {
            int guess=Integer.parseInt(JOptionPane.showInputDialog("guess the number"));
            if (guess > gen){
                JOptionPane.showMessageDialog(null, " lower \n" +guessnr+ " total attempts ");
                guessnr++;

            }
            else if (guess < gen) {
                JOptionPane.showMessageDialog(null, " higher \n" +guessnr+ " total attempts ");
                guessnr++;

            }
            else{
                JOptionPane.showMessageDialog(null, " you guessed right \n goodbye \n"  +guessnr+ " total attempts ");
                break;
            }
        }

    }
}
