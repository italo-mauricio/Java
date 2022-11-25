// Calculadora


public class calculadora {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        sum(x, y);
        menos(x, y);
        multi(x, y);
        div(x , y);
          
    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }
                                                         
    static void menos(int x, int y){
        System.out.println(x - y);
    }            

    static void multi(int x, int y){
        System.out.println(x * y);
    } 

    static void div(int x, int y){
        System.out.println(x / y);
    }
    
}