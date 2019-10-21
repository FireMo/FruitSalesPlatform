package com.enjoy.bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

/**
 * @Descirption
 * @Author FireMo
 * @Date 2019/10/18 11:31
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //服务端必备
        ServerSocket serverSocket = new ServerSocket();
        //绑定监听端口
        serverSocket.bind(new InetSocketAddress(10001));

    }
}
