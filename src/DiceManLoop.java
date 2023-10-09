import javax.swing.*;
import java.util.Random;

public class DiceManLoop
{
    public static void main(String[] args)
    {
        Random gen=new Random();
        int dice;
        String activity="";
        int answer;
        boolean keepGoing=true;

        System.out.println("DiceMan Loop");

        while (keepGoing) {
            dice=gen.nextInt(6)+1;   //[1,6]

            if (dice==1) {
                activity="Breakfast";
            } else
            if (dice==2) {
                activity="Study";
            } else
            if (dice==3) {
                activity="Swim";
            } else
            if (dice==4) {
                activity="Go fishing";
            } else
            if (dice==5) {
                activity="Call mom";
            } else
            if (dice==6) {
                activity="Back to bed";
            }
            System.out.println(activity);

//            if (dice==6) keepGoing=false;
            answer=JOptionPane.showConfirmDialog(null, activity+ "\n Try again ?", "DiceManLoop", JOptionPane.YES_NO_OPTION);
            if (answer==JOptionPane.NO_OPTION) keepGoing=false;
        }

        System.out.println("Goodbye");
    }
}
