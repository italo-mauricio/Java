public class Aula7 {
    public static void main(String[] args) {
        // escopo de variável
        if (true){
            int x = 19;   // variável local, declaraada dentro desse escopo
        }
        int x = 20;  // só consigo fazer a chamada da variável se ela for declarada fora do escopo
        System.out.println(x);

    }
}
