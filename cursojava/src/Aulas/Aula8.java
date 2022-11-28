package Aulas;

import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) {
        // converter tipos primitivos

        double dd = 10.10;
        short ss = 32;

        float x = (float) dd / ss;    // dessa forma, conseguimos fazer a conversão para o tipo float
        int y = (int) dd / ss;

        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble();

        System.out.println(z);

        System.out.println(x);
        System.out.println(y);
    }
}
