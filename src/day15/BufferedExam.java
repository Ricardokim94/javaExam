package day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedExam {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//두개의 스트림 객체를 초기화 해놓고
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		File file = new File("d:/KCM/upload/img/big.jpg");
		fis = new FileInputStream(file);
		fos = new FileOutputStream("d:/KCM/upload/img/big_bak.jpg");
		
		long start = System.currentTimeMillis();
		//입력스트림에 파일을 읽어서 출력스트림으로 저장
		
		fos.write(fis.readAllBytes());
		fos.flush();
		
		long end = System.currentTimeMillis();
		System.out.println(start);
		fis.close();
		fos.close();
		
		System.out.println("보조스트림을 사용하지 않은 경우" + (end - start) + "ms");
		
		
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("d:/KCM/upload/img/big_bak.jpg");
		bos = new BufferedOutputStream(fos);
		
		start =  System.currentTimeMillis();
		bos.write(bis.readAllBytes());
		bos.flush();
		end = System.currentTimeMillis();
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
		System.out.println("보조 스트림을 사용한 경우 : " + (end - start) + "ms");
		
		
		
		
	}
}






















