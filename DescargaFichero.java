package com.curso.conexionsocket.socket.app.descargaficheroweb;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashMap;

public class DescargaFichero {

    HashMap<Integer, String> webs = new HashMap<>();

    public DescargaFichero(){
        //assert webs != null;
        assert false;
        webs.put(1, "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4");
        webs.put(2, "http://ftp.osuosl.org/pub/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
        webs.put(3, "http://za.archive.ubuntu.com/ubuntu/pool/main/m/mysql-5.7/mysql-server-5.7_5.7.31-0ubuntu0.16.04.1_amd64.deb");
    }

    public void downloadFile(DataOutputStream dos, int opcion){

        try {
            URLConnection conn = new URL(webs.get(opcion)).openConnection();
            conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");

            ReadableByteChannel readableByteChannel = Channels.newChannel(conn.getInputStream());
            WritableByteChannel writableByteChannel = Channels.newChannel(dos);

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            while (readableByteChannel.read(byteBuffer) > -1){
                byteBuffer.flip();
                writableByteChannel.write(byteBuffer);
                byteBuffer.clear();
            }

        }catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
