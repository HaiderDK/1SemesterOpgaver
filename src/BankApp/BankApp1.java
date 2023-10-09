package BankApp;

public class BankApp1
{
    public static void main(String[] args)
    {
    double konto_1 = 50.25;
    int konto_nr_1 = 1;
    String name_1 = "Ole Hansen";

    double konto_2;
    int konto_nr_2;
    String name_2;

    konto_2 = 100;
    konto_nr_2 = 2;
    name_2 = "Pia Nielsen";

    System.out.println(" før");
    System.out.println(" Konto " +konto_nr_1+ ": " +name_1+ " "+konto_1);
    System.out.println(" Konto " +konto_nr_2+ ": " +name_2+ " "+konto_2);

    konto_1 = konto_1 + 100;
    konto_1 = konto_1 * 1.05;

    System.out.println(" efter");
    System.out.println(" Konto " +konto_nr_1+ ": " +name_1+ " "+konto_1);
    System.out.println(" Konto " +konto_nr_2+ ": " +name_2+ " "+konto_2);

    double samlet_indestaaende = konto_1 + konto_2;

    System.out.println(" samlet_indestaaende " +samlet_indestaaende);

    double gns_indlaan = samlet_indestaaende/2;

    System.out.println(" gns_indlaan " +gns_indlaan);
    }
}
