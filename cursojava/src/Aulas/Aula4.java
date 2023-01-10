package Aulas;

public class Aula4 {

    public static void main(String[] args) {
        sum( 10, 20);  // argumentos
        sum( 15, 20);
        sum( 1223, 20);
        sum( 133, 2022);
    }

    static void sum(int x, int y) {
        // static void = declaração padrão
        // sum = nome da função, pode ser qualquer nome
        // () = usamos para definir os parâmetros da função


        System.out.println(x + y);  // o método pode ser reutilizado em outras partes do código

    }




}