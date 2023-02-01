/*Write a program to print the name, salary and date of joining of 10 employees in a company.
        Use array of objects.*/

package application;

import entities.Employees;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employees[] vetor = new Employees[10];

        for (int i = 0; i < 10; i++) {
            sc = new Scanner(System.in);
            String name = sc.nextLine();
            double salary = sc.nextDouble();
            sc = new Scanner(System.in);
            String data = sc.nextLine();

            vetor[i] = new Employees(name, salary,data);

        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        sc.close();
    }
}
