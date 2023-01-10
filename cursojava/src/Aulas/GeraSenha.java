package Aulas;

import com.italomauricio.app.User;
import java.util.Random;

public class GeraSenha{

    User user = new User();
    // teste1111
    public static void main(String[] args) {
        Random gerador = new Random();
        // utilizando o while
       int a = 0;
        while(a < 6){
            int number = gerador.nextInt(60);
            System.out.println(number);
         a+=1;

        }
       // utilizando o for
        for(int i = 0; i < 6; i++){
            int number = gerador.nextInt(60);
            System.out.println(number);


        }
    }

}