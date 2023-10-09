public class veksleprogram
{
    public static void main(String[] args)
    {
        int dollar;
                dollar = 69;
        double euro;
                euro = dollar * 0.92;

        System.out.println(" veksler " +dollar+ " dollar til euro og får " + euro );

        double kommission;
        kommission = euro/100 * 2;
        double total;
        total = 0;

        if (kommission >= 0.5)
        {
            total = euro - kommission;
            System.out.println(" kommissionen er 2% ");
        }
        else if (kommission < 0.5)
        {
            total = euro - 0.5;
            System.out.println(" kommissionen er 0.5 euro ");
        }
        System.out.println(" efter kommissionen har vi " +total+ " euro tilbage ");
    }
}
