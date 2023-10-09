package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1=new Account(" Joe Pass ", 5);
        Account a2=new Account(" Jimmy Hendrix ", 7);

        a1.deposit(100);
        a1.withdraw(50);
        a1.setOwner(" Carsten ");


        a1.anualInterest();     //metodekald
        a2.anualInterest();     //metodekald

        a1.printTransactions();     //metodekald - a1/a2 er prefix
        a2.printTransactions();     //metodekald

    }
}

class Account {     //class
    private static int noOfAccounts=0;      //account number generator
    private int accountNo;      //account number
    private String owner;       //owner name
    public double balance;         //indestående
    private double interestRate;        //årlige rente i %
    ArrayList<Transaction> transactions=new ArrayList<Transaction>();       //transaction list



    Account(String ow, double ir){      //konstruktor/metode
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=ow;
        interestRate=ir;
        balance=0;

    }

    void setOwner(String newName){      //metode
        owner=newName;
    }

    void deposit(double amount){    //metode
        balance=balance+amount;
        transactions.add(new Transaction(" Indsat ", amount, balance));

    }

    void withdraw (double amount){      //metode
        balance=balance-amount;
        transactions.add(new Transaction(" Hævet ", amount, balance));
    }

    void anualInterest(){       //metode
        double amount = balance*interestRate/100;
        balance = balance+amount;
        transactions.add(new Transaction(" Renter ", amount, balance));
    }

    void printTransactions(){       //metode
        System.out.println(this);
        System.out.println(" Tekst\tDato\t\tBeløb\tSaldo ");
        for (Transaction t: transactions)
            System.out.println(t);
        System.out.println();
    }
    @Override
    public String toString() {      //return to main to print text
        return " Kontonr: " +accountNo+"\t"+owner+"\t"+balance;
    }
}

class Transaction{      //class
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance){     //konstruktor/metode
        this.text=text;
        this.amount=amount;
        this.newBalance=newBalance;
        date=LocalDate.now();
    }

    @Override
    public String toString() {      //return to main to print text
        return text + date + "\t" + amount + "\t" + newBalance;
    }
}