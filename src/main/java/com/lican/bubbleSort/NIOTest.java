package com.lican.bubbleSort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile aFile = new RandomAccessFile("./lican.txt","rw");
            System.out.println(aFile);
            FileChannel aChannel = aFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(48);
            try {
                int byteReader = aChannel.read(buf);
                System.out.println("000000");
                while (byteReader != -1){
                    buf.flip();
                    System.out.println("111111111");
                    while (buf.hasRemaining()){
                        System.out.println((char) buf.get());
                    }
                    buf.clear();
                    byteReader = aChannel.read(buf);
                }
                aFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
