import java.util.Scanner;

public class Tablero_ajedrez {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("eyy");
        int valor = a.nextInt();

        for (int c = 0; c<valor ; c++ ){
            if (c%2==0){
                for (int d =0 ; valor>d ;d++){
                    if (d%2==0){
                        System.out.print("#");
                    }else{
                        System.out.print("-");
                    }

                }System.out.println("");
            }else{
                for ( int i =0 ; valor > i ;i++){
                    if (i%2==0){
                        System.out.print("-");

                    }else{
                        System.out.print("#");
                    }

                }System.out.println("");
            }
        }

    }
}
