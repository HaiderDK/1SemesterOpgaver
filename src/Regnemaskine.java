import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1=0;
        double num2=0;
        char op;
        double result;

        while (true){
            System.out.println(" Velkommen til regnemaskinen");
            System.out.println(" + for addition ");
            System.out.println(" - for subtraktion ");
            System.out.println(" * for multiplikation ");
            System.out.println(" / for division ");
            System.out.println(" q for quit ");
            System.out.print(" indtast operator: ");
            op=input.next().charAt(0);
            if (op=='q') break;

            num1=inputDouble(" indtast tal1: ");
            num2=inputDouble(" indtast tal2: ");


            switch (op){
                case '+':
                result=num1+num2;
                break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;
                default:
                    System.out.println(" ugyldig operator ");
                    continue;
            }
            System.out.println(" resultat: " +result);
            System.out.println();
        } //while
        System.out.println(" Tak for i dag ");
    } //main

    static double inputDouble (String prompt) {
        Scanner input=new Scanner(System.in);
        boolean ok=false;
        double num=0;

        do {
            try {
                System.out.print(prompt);
                num= input.nextDouble();
                ok=true;
            } catch (InputMismatchException e) {
                System.out.println(" ulovligt input. prøv igen ");
                input.nextLine();
            }
        } while (!ok);
        return num;
    }
}
