public class Main
{
    public static void main(String[] args)
    {

        //  opgave 1: et program der regner arealet af et rektangel
        int laengde, bredde, areal;
        laengde = 5;
        bredde = 5;
        areal = laengde * bredde;
        System.out.println(" vi ganger længden " +laengde+ " med bredden " +bredde+ " som giver arealet " +areal);

        // opgave 2
        int x = 7;
        int y = 3*x*x+6*x+9;

        System.out.println(" svaret for y=3*x*x+6*x+9 hvor x er 7 er " +y);

        // opgave 3

        int dollar;
        dollar = 500;
        double euro;
        euro = dollar * 0.95;

        System.out.println(" veksle 500 dollar til euro " +euro);

        // opgave 4

        double a, b, c, sum, gennemsnit;

        a = Math.random();
        b = Math.random();
        c = Math.random();

        System.out.println(" random tal " +a+ ", " +b+ ", " +c);

        sum = a + b + c;

        System.out.println("summen af a,b og c " +sum);

        gennemsnit = sum / 3;

        System.out.println("gennemsnit " +gennemsnit);
    }
}