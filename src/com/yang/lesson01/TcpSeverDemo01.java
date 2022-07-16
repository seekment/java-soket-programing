package com.yang.lesson01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName TcpSeverDemo01
 * @Author yang
 * @Description //TODO
 * @Date 22/07/15 1:02
 * @Version v1.0
 **/


public class TcpSeverDemo01 {
    public static void main(String[] args) throws IOException {
        InetAddress byAddress = InetAddress.getByName("127.0.0.1");
        int port = 9999;
        Socket socket = new Socket(byAddress,port);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("clint:你好！".getBytes(StandardCharsets.UTF_8));

        System.out.println();
    }
}
