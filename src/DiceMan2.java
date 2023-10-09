import javax.swing.*;
import java.util.Random;

public class DiceMan2
{
    public static void main(String[] args)
    {
        Random gen=new Random();
        int Dice=gen.nextInt(6)+1;
        String activity="";
        switch (Dice)
        {
            case 1:
                activity="Eat breakfast";
                break;
            case 2:
                activity="Study";
                break;
            case 3:
                activity="Swim";
                break;
            case 4:
                activity="Fishing";
                break;
            case 5:
                activity="Call mom";
                break;
            case 6:
                activity="Back to bed";
                break;
        }
        JOptionPane.showMessageDialog(null, "You rolled number " +Dice+ " \nGo " + activity);
        JOptionPane.showMessageDialog(null, " gae ");

    }
}
