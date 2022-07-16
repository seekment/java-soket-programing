package com.yang.lesson02_file_upload;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TcpClinetDemo02
 * @Author yang
 * @Description //TODO
 * @Date 22/07/15 9:44
 * @Version v1.0
 **/


public class TcpClinetDemo02 {
    public static void main(String[] args) {

        try {
            // 1 初始化地址
            Socket accept;
            try (ServerSocket serverSocket = new ServerSocket(9999)) {
                // 等待连接
                accept = serverSocket.accept();
            }
            // 3 读取信息
            InputStream inputStream = accept.getInputStream();

            System.out.println( inputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
