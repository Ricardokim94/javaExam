package day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer; //출력할때

public class CharacterStreamExam {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("d:/hello.txt");
			Writer writer = new FileWriter("d:/hello3.txt");
			
			//read() : 입력스트림으로부터 !한개!의 문자를 읽고 리턴한다.
			int readData ;
			while((readData = reader.read()) != -1) {
				System.out.print((char)readData);
				writer.write(readData);
				writer.flush();
			}
			reader.close();
			writer.close();
			
			
//read(cahr[] c) 한개씩 읽는게 아니라 배열에 담아서 배열의 size만큼 읽어들이는 것임
			Reader reader2 = new FileReader("d:/hello.txt");
			Writer writer2 = new FileWriter("d:/hello3.txt");
			char[] cbuf = new char[50];
			
			int readChar;
			while((readChar = reader2.read(cbuf)) != -1) {
				writer2.write(cbuf);
				writer2.flush();
			}
//			System.out.println(readChar);
//			readChar = reader2.read(cbuf);
//			System.out.println(readChar);
			reader2.close();
			writer2.close();
			

//read(char[] c, int 시작인덱스번호, int 길이)
			Reader reader3 = new FileReader("d:/hello.txt");
			Writer writer3 = new FileWriter("d:/hello6.txt");

//			readChar = reader3.read(cbuf,0,cbuf.length);
//			for(char charval : cbuf) {
//				System.out.print(charval);
//			}
			
			//Char data = "ABC".getChars(readChar, readData, cbuf, readChar);
			
			while((readChar = reader3.read(cbuf)) != -1) {
				writer3.write(cbuf,0,cbuf.length);
				writer3.flush();
			}
			reader3.close();
			writer3.close();
			
			
//			while((readChar3 = reader3.read(cbuf,3,5)) != -1) {
//			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
