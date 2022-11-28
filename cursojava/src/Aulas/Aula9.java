package Aulas;

public class Aula9 {
    public static void main(String[] args) {
        // manipulando strings
        String x = "ola meu nome é italo";
        System.out.println(x.length());  //length conta quantos caracteres existem la frase
        System.out.println(x + "concatenada");  // concatena
        System.out.println(x.contains("italo"));; // verifica se a palavra existe na frase
        System.out.println(x.indexOf("italo")); // indica em qual caractere começa a palavra
        System.out.println(x.lastIndexOf("italo")); // indica a ultima ocorrencia
        System.out.println(x.toUpperCase());  // deixa tudo em maiúsculo
        System.out.println(x.toLowerCase());  // deixa tudo em minúsculo
        System.out.println(x.trim());  // remove os espaços
        System.out.println(x.substring(9));  // busca a frase a partir do caractere desejado
        System.out.println(x.equals("ola"));   // comparação
    }
}
