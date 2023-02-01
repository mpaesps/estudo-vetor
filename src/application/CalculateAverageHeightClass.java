package application;

import entities.Employees;
import entities.StudentHeight;

import java.util.Scanner;

public class CalculateAverageHeightClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StudentHeight[] vetor = new StudentHeight[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + i + " height: ");
            double height = sc.nextDouble();
            vetor[i] = new StudentHeight(height);
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i].getHeight();
        }
        double average = soma / n;

        System.out.println("AVERAGE " + average);
    }
}
