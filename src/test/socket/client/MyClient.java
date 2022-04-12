package test.socket.client;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("Localhost", 6666);
			DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());
			dataOutputStream.writeUTF("Hello Server!!");
			dataOutputStream.flush();
			dataOutputStream.close();
			s.close();			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}
