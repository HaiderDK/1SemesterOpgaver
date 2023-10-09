//library
import java.util.Random;

public class PlatEllerKrone
{
    public static void main (String[] args)
    {
// gen er navnet på variablet
        Random gen=new Random();
        int tal=gen.nextInt(2);
        System.out.println("tal="+tal);
// blokke {} med flere println, if og else
        if (tal==0) {
            System.out.println("Plat");
            System.out.println("Tillykke du vandt");
        }
        else {
            System.out.println("Krone");
            System.out.println("Noob du tabte");
        }
        System.out.println("Tak for i dag");
    }
}
