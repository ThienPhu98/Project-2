package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double vnd = 23000;
    double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of money (USD): ");
        usd = sc.nextDouble();
        double Change = usd * vnd;
        System.out.print("Amount of VND is: " + Change);
    }
}
