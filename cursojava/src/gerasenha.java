import java.util.Random;

public class gerasenha{
    
    public static void main(String[] args) {
        Random gerador = new Random();

        int number = gerador.nextInt(60);

        System.out.println(number);
    }

}