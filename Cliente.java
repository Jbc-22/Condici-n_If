package com.curso.conexionsocket.socket.app.descargaficheroweb;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] agrs) throws IOException {
        Cliente.mostrarMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNúmero ----> ");
        int input = sc.nextInt();

        Socket ss = new Socket("localhost", 3333);
        DataOutputStream doutSalida = new DataOutputStream(ss.getOutputStream());
        doutSalida.writeInt(input);

        System.out.println("Mensaje enviado\n ");

        DataInputStream dinEntrada = new DataInputStream(ss.getInputStream());
        FileOutputStream fileSalida = new FileOutputStream("film.mp4");

        ReadableByteChannel readableByteChannel = Channels.newChannel(dinEntrada);
        WritableByteChannel writableByteChannel = Channels.newChannel(fileSalida);

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (readableByteChannel.read(byteBuffer) > -1){
            byteBuffer.flip();
            writableByteChannel.write(byteBuffer);
            byteBuffer.clear();
        }

        dinEntrada.close();
        doutSalida.close();
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
