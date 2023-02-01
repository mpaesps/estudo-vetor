package application;

import entities.BankAccount;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Insert the number of depositors: ");
        int n = sc.nextInt();
        BankAccount[] vetorBanco = new BankAccount[n];

        int id = 1000;
        for (i = 0; i < vetorBanco.length; i++) {
            System.out.print("Name: ");
            String name = sc.next();
            sc = new Scanner(System.in);
            System.out.print("Adress: ");
            String adress = sc.nextLine();
            System.out.print("Account Type: ");
            String account_type = sc.next();
            System.out.print("Balance: ");
            Double balance = sc.nextDouble();

            vetorBanco[i] = new BankAccount(id, name, adress, account_type, balance);
            vetorBanco[i].setId(id++);
        }

        System.out.println();
        System.out.println("Total of depositors: " + i);
        for (i = 0; i < vetorBanco.length; i++) {
            System.out.println(i + "-" + vetorBanco[i].getName());
        }

        System.out.println();
        System.out.print("Enter the id of depositor to show options: ");
        int search = sc.nextInt();
        System.out.println();
        System.out.println(vetorBanco[search]);
        System.out.println("1-Withdraw");
        System.out.println("2-Deposit");
        System.out.println("3-Change Adress");
        System.out.println("4-Exit");
        System.out.println("What do you want to do now?");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("withdraw value: ");
                double mount = sc.nextDouble();
                vetorBanco[search].withdraw(mount);
                System.out.println();
                System.out.println("Account updated data:" + vetorBanco[search]);
                System.out.println();
                break;
            case 2:
                System.out.print("deposit value: ");
                mount = sc.nextDouble();
                vetorBanco[search].deposit(mount);
                System.out.println();
                System.out.println("Account updated data:" + vetorBanco[search]);
                System.out.println();
                break;
            case 3:
                System.out.println("new addres: ");
                sc = new Scanner(System.in);
                String newAdress = sc.nextLine();
                vetorBanco[search].setAdress(newAdress);
                System.out.println();
                System.out.println("Account updated data:" + vetorBanco[search]);
                System.out.println();
                break;
            default:
                System.out.println("See you later!");
        }



       /* for ( i = 0; i < vetorBanco.length; i++) {
            System.out.println(vetorBanco[i]);
        }

        System.out.print("withdraw value: " );
        double mount = sc.nextDouble();
        vetorBanco[0].withdraw(mount);

        System.out.println();
        System.out.println("Account data:" + vetorBanco[0]);
        System.out.println();

        System.out.println("deposit value: ");
        mount = sc.nextDouble();
        vetorBanco[0].deposit(mount);*/
    }

}
