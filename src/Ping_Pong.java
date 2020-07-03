
import java.util.Scanner;
public class Ping_Pong {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingresa un número:");
            int num = s.nextInt();
            int contador = 0;

            while (num >= contador) {

                if (contador % 5 == 0){

                    if (contador%10==0){
                        System.out.println(contador + "Pong");
                    }else{
                        System.out.println(""+contador+"Ping");
                    }

                }
                else {
                    System.out.println(contador);
                }
                contador++;

            }

        }

}
