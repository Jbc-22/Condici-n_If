package com.curso.conexionsocket.socket.app_descarga_fichero;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] agrs) throws IOException {
        Cliente.mostrarMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNúmero ----> ");
        int input = sc.nextInt();

//        System.out.println("\nNombre que le desea dar al fichero\n----> ");
//        int input1 = sc.nextInt();

        Socket ss = new Socket("localhost", 3333);
        DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
        dout.writeInt(input);

        System.out.println("Mensaje enviado\n ");

        DataInputStream din = new DataInputStream(ss.getInputStream());
        String respuesta = din.readUTF();

        System.out.println("Respuesta del servidor: " + respuesta);

        din.close();
        dout.close();
        ss.close();

    }

    static void mostrarMenu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("                         MENÚ");
        System.out.println(" Seleciona el NÚMERO del fichero que quiere descargar: ");
        System.out.println("-------------------------------------------------------\n");

        String[] menu = new String[]{"1. Kernel ", "2. FTP ", "3. ZA"};
        for (int i  = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }
}
