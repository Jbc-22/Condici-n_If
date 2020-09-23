package com.curso.conexionsocket.socket.app_descarga_fichero;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashMap;

public class DescargaFichero {

    HashMap<Integer, String> webs;

    public DescargaFichero(){
        //assert webs != null;
        assert false;
        webs.put(1, "http://mirrors.kernel.org/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
        webs.put(2, "http://ftp.osuosl.org/pub/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
        webs.put(3, "http://za.archive.ubuntu.com/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
    }


    public void downloadFile(DataOutputStream dos, int opcion){


        try {
            ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(webs.get(opcion)).openStream());

            BufferedReader bufferedReader = new BufferedReader((Reader) readableByteChannel);

            WritableByteChannel writableByteChannel = Channels.newChannel(dos);

        }catch (IOException io) {
            io.printStackTrace();
        }

    }
}
