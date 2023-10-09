public class StørstMindst
{
    public static void main (String[] args)
    {
        int tal1 = 1000, tal2 = 500, tal3 = 100;

        // til at finde det største nummer
        if (tal1 > tal2 && tal1 > tal3)
        System.out.println(tal1 + " is the largest number ");

        else if (tal2 > tal1 && tal2 > tal3)
        System.out.println(tal2 + " is the largest number ");

        else
        System.out.println(tal3 + " is the largest number ");

        // til at finde det mindste nummer
        if (tal1 < tal2 && tal1 < tal3)
            System.out.println(tal1 + " is the smallest number ");

        else if (tal2 < tal1 && tal2 < tal3)
            System.out.println(tal2 + " is the smallest number ");

        else
            System.out.println(tal3 + " is the smallest number ");
    }

}
