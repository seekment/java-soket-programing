package com.yang.lesson03_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName UdpClientDemo01
 * @Author yang
 * @Description //TODO
 * @Date 22/07/16 22:53
 * @Version v1.0
 **/

// 不需要连接服务器
public class UdpClientDemo01 {

    public static void main(String[] args) throws Exception {
        // 1 建立soket
        DatagramSocket datagramSocket = new DatagramSocket();
        // 2 建立datagram数据报
        String msg = "你好啊";
       InetAddress localHost = InetAddress.getByName("localhost");
       int port = 9090;
//    数据， 数据的长度起始，要发送给谁。
        DatagramPacket packet = new DatagramPacket(msg.getBytes(),0,msg.getBytes(StandardCharsets.UTF_8).length,localHost,port);
        // 3 发送包
        datagramSocket.send(packet);
        // 4 关闭流
        datagramSocket.close();
    }
}
