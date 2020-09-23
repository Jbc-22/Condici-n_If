package com.curso.conexionsocket.socket.app_descarga_fichero;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main (String[] agrs) throws IOException {
        DescargaFichero descargaFichero = new DescargaFichero();

        ServerSocket ss = new ServerSocket(3333);
        System.out.println("Escuchando las peticiones... ");

        while (true){

            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            int opcion = din.readInt();

            descargaFichero.downloadFile(dos, opcion);

            System.out.println("Transferencia completada ");

            s.close();
        }
    }


}

