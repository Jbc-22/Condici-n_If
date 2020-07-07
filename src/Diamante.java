import java.util.Scanner;

public class Diamante {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.println("Por favor, decir el tamaño del diamante");
        int total =d.nextInt();
        //int mun =d.nextInt();

        System.out.println("Este es tu DIAMANTE");
        //int total = 10;
        int filasDiamante = total * 2 - 1;
        for(int fila=1; fila <= filasDiamante; fila++) {
            int spaces = Math.abs(fila - total) * 2;
            int points = filasDiamante - spaces;
            for(int col =1 ;col <= spaces/2; col++) {
                System.out.print(" ");
            }
            for(int col = 1;col <= points; col++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*int i=0, j=0, k=0;
        for ( i += 1; i <= mun; i += 2){
            for (k = mun+1; k >= i; k -= 2){
                System.out.print(" ");
            }
            for (j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        } */


       /* for (int i = 1; i <= mun + (mun - 1); i++){
            for (int j = 1 ; j<=(mun-i);j++ ){
                System.out.print("ñ");
            }
            System.out.println();

        }*/
    }
}
