// Calculadora


public class calculadora {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")){
            sum(x, y);
        } else if(args[1].equals("subtrair")){
            menos(x, y);
        } else if(args[2].equals("multiplicar")){
            multi(x, y);
        } else if(args[3].equals("dividir")){
            div(x, y);
        }
          
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