package Aulas;

import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        // comparando strings
        String password = "123456";

        System.out.println("Digite sua senha: ");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(password.equals(pass));

        // o == não compara o conteudo, mas sim, a referência dos objetos
        //System.out.println(password == pass);

        // usando new String a comparação dará false, pois estão armazenados em endereços diferentes
        String x = new String( "123456");
        String y = new String( "123456");
        System.out.println(x == y);
    }
}
