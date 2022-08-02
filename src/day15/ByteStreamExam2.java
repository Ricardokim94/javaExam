package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExam2 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:/hello.txt");
			OutputStream os = new FileOutputStream("D:/hello2.txt", true);

			os.write(is.readAllBytes());

			System.out.println("파일이 복사 되었습니다");

			byte[] data = "ABC".getBytes();
			os.write(data);

			os.close();//출력 스트림 바로 닫음
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
