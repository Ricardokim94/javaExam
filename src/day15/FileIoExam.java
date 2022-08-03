package day15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileIoExam {
	public static void main(String[] args) throws IOException {
		File dir = new File("d:/KCM/upload/");
		File file1 = new File("d:/KCM/upload/file1.txt");
		File file2 = new File("d:/KCM/upload/hello.jpg");
		System.out.println("디렉토리 존재여부 : " + dir.exists());
		
		if(!dir.exists()) {
			dir.mkdir(); //dir에 파일 없으면 만들어라
		}
		if(!file1.exists()) {
			file1.createNewFile(); //file1에 파일없으면 txt만들어라
		}
		
		String strval = "반갑습니다. hello^^";
		char[] data = strval.toCharArray();
		//출력스트림을 이용해서 file1.txt에 저장
		Writer ws = new FileWriter(file1);
		ws.write(data);
		ws.flush();
		
		//자바 파일도 가능하다
		String stravl2 = "public calss hello { public static void main(String[] args){} }";
		char[] data2 = stravl2.toCharArray();
		
		Writer wss = new FileWriter(file2);
		wss.write(data2);
		wss.flush();
		
		
		//폴더 생성
		File dir2 = new File("d:/KCM/upload/img");
		
		if(!dir2.exists()) {
			dir2.mkdir(); 
		}
		
		
		//디렉토리에 어떤파일이 있는지 알고 싶으면 배열에 담으면 된다.
		File[] contents = dir.listFiles();
		
		for(File file : contents) {
			if(file.isDirectory()) {
				System.out.println("<DIR>\t" + file.getName());
			}else {
				System.out.println("\t\t" + file.getName() + "\t" + file.length());
			}
		}
		
		
	}
}


















