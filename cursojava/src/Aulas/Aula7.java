package Aulas;

public class Aula7 {
    public static void main(String[] args) {
        // escopo de variável
        int x;
        if (true){
            x = 19;   // variável local, declaraada dentro desse escopo
        } else{
            x = 2;
        }
      // só consigo fazer a chamada da variável se ela for declarada fora do escopo
        System.out.println(x);

    }
}
