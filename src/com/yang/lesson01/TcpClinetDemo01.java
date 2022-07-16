package com.yang.lesson01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TcpClinetDemo01
 * @Author yang
 * @Description //TODO
 * @Date 22/07/15 1:01
 * @Version v1.0
 **/


public class TcpClinetDemo01 {
    public static void main(String[] args) {

        try {
            // 1 初始化地址
            Socket accept;
            try (ServerSocket serverSocket = new ServerSocket(9999)) {
                // 等待连接
                System.out.println("等待连接...");
                accept = serverSocket.accept(); //会阻塞
                System.out.println("//会阻塞");
            }
            // 3 读取信息
            InputStream inputStream = accept.getInputStream();

            System.out.println( inputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
