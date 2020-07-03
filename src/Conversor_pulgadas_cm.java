import java.util.Scanner;

public class Conversor_pulgadas_cm {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.println("¿Qué usted desea convertir?");
        System.out.println("Pulsar 1, si quiere convertir CENTIMETROS a PULGADAS");
        System.out.println("Pulsar 2, si quiere convertir PULGADAS a CENTIMETROS");
        int Opcion = c.nextInt();

        System.out.println("Introducir el valor a convertir:");
        float Valor = c.nextInt();

        if (Opcion == 1){
            double pul = Valor * 2.54;
            System.out.println(Valor + "centimetros es igual a" + pul + "pulgadas");
        }
        else {
            double cm = Valor / 2.54;
            System.out.println(Valor + "pulgadas es igual a" + cm + "centimetros");

        }

    }
}
