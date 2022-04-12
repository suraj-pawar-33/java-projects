package test.socket.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			DataInputStream dataInputSream = new DataInputStream(s.getInputStream());
			String str = dataInputSream.readUTF();
			ss.close();
			System.out.println("Message : " + str);
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
//			e.printStackTrace();
		}
	}
}
