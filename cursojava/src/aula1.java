//              INTRODUÇÃO A LINGUAGEM JAVA

import java.util.Date;

public class aula1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema"); 
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
    }
    
}


// sout = reproduz autoameticamente o system out print
// psvm = public static void main (gera automaticamente)
// camelcase = técnica que exibe os nomes das classes em formas de camelos "Mina Classe"
// primeira letra maiuscula é sempre uma classe
/*
 * Se a primeira letra for minúscula e aparecer uma letra maiuscula após ela pode ser:
 * Atributo
 * Variavel
 * Método
 * meu_pacote - se for tudo em letra minuscula
 * 
 */
