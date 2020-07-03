import java.util.Scanner;

public class Año_bisiesto {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Introducir un año:");
        int año = v.nextInt();

        // Opcion 1

        if (año % 400 == 0){
            System.out.println("El año es bisiesto");
            }
        if (año % 4 ==0 && año % 100 != 0){
            System.out.println("El año es bisiesto");
        }
        else{
            System.out.println("El año no es bisiesto");
        }

        //Opcion 2

        /*if (año % 4 != 0 && año % 100 == 0 || año % 400 != 0 ){
            System.out.println("no bisiesto");

        }
        else {
            System.out.println("es bisiesto");

        }*/


    }
}
