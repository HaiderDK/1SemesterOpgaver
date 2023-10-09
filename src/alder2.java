public class alder2
{
    public static void main(String[] arg)
    {
        int alder;
        alder = 1;

        if (alder >= 18) {
            System.out.println("Du er myndig.");
        }
        else if (alder >=12) {
            System.out.println("likey likey");
        }
        else if (alder >=2) {
            System.out.println("gae");
        }
        else
            System.out.println("Du er ikke myndig.");

        System.out.println("Du er " + alder + " år.");
    }
}
