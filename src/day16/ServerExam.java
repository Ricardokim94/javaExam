package day16;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerExam {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.10.91", 9999));
			while(true) {
				System.out.println("[연결기다림]");
				Socket socket = serverSocket.accept(); //클라이언트 연결 
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[받은 메시지]:" + message);
				
				OutputStream os = socket.getOutputStream();
				message = "클하";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[클라이언트로 메시지 전송 완료]");
				is.close();
				os.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(!serverSocket.isClosed());{
				try {
					serverSocket.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
