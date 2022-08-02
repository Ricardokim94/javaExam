package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExam {
	
	////////////파일복사 방식/////
	public static void main(String[] args) {
		try {
//[[입력Stream]] + 			
			//출력Stream[[outputStream]]
			
//방법1			
			InputStream is = new FileInputStream("D:/11.jpg");
			OutputStream os = new FileOutputStream("D:/11_back.jpg");

			//read() : 입력스트림으로부터 1바이트를 읽고 읽은 바이트를 리턴
			int readByte;
			int cnt = 0;
			while((readByte=is.read()) != -1) {
				System.out.println("횟수 : " + cnt++ + ", 1바이트값 : " +readByte);
				//write(int b) : 출력스트림으로 1byte 보냄
				os.write(readByte);
			}
			os.close();//출력 스트림 바로 닫음
			is.close();
//방법2
			InputStream is2 = new FileInputStream("D:/11.jpg");
			OutputStream os2 = new FileOutputStream("D:/11_back2.jpg");
			//read(byte[] b) : 읽은 바이트들을 바이트배열 b에 저장하고 읽은 바이트수를 리턴
			int readByte2 = 0; // 초기화 해주기 앞에서 readByte에 담은 값이 있으니까
			cnt = 1;
			byte[] b = new byte[1000];
			while((readByte2 = is2.read(b)) != -1) {
				System.out.println(cnt++ + "번째 읽은 바이트 수 : " + readByte2);
				//write(byte[] b) : 출력스트림으로 주어진 바이트 배열b의 모근 바이트를 보냄
				os2.write(b);
				os2.flush();//남아있는 byte를 한꺼번에 쓴는것
			}

			//read(byte[] b, int 시작위치인텍스, int len) : 인덱스로부터 len개 까지 저장, 리턴값이 len개 리턴함

//방법3
			InputStream is3 = new FileInputStream("D:/11.jpg");
			OutputStream os3 = new FileOutputStream("D:/11_back3.jpg");
			int readByte3 =0;
			cnt=1;
			while((readByte3 = is3.read(b,0,1000)) != -1) {
				System.out.println(cnt++ + "번째 읽은 바이트 수 : " + readByte3);
				os3.write(b,0,readByte3);
			}
			
			//다 사용하면 메모리를 반납해줘야함
			//is3.close();
			is2.close();
			is3.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


















