import java.util.Random;

public class gerasenha{
    
    public static void main(String[] args) {
        Random gerador = new Random();

        int i = 0;
        while(i < 6){
            int number = gerador.nextInt(60);
            System.out.println(number);
            i+=1;

        }
    }

}