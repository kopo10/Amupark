package DOg;

import java.net.*;
import java.io.*;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader om = new BufferedReader( new InputStreamReader(System.in));
		while (true){
			System.out.println("ㅇㅇ");
			String msg ="";
			
		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("192.168.23.22");
			
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,ia,1212);
			
			ds.send(dp);
			System.out.println("11전송완료");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}
