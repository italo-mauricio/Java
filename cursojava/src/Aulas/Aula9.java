package Aulas;

public class Aula9 {
    public static void main(String[] args) {
        // manipulando strings
        String x = "ola meu nome é italo";
        System.out.println(x.length());  //length conta quantos caracteres existem la frase
        System.out.println(x + "concatenada");  // concatena
        System.out.println(x.contains("italo"));; // verifica se a palavra existe na frase
        System.out.println(x.indexOf("italo")); // indica em qual caractere começa a palavra
    }
}
