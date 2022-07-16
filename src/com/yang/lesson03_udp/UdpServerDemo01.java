package com.yang.lesson03_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName UdpServerDemo01
 * @Author yang
 * @Description //TODO
 * @Date 22/07/16 22:56
 * @Version v1.0
 **/

// 还是需要等待客户端的连接
public class UdpServerDemo01 {
    public static void main(String[] args) throws IOException {
  // 开放端口
        DatagramSocket datagramSocket = new DatagramSocket(9090);

        // 接受数据
        byte[] buffer = new byte[1024];
        DatagramPacket packet =   new DatagramPacket(buffer,0,buffer.length);
        datagramSocket.receive(packet);

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println( new String( packet.getData(),0,packet.getLength()));

        datagramSocket.close();
    }
}
