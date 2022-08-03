package day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day05.Member;

public class FilterExam {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//바이트기반 : xxxInputStream,  xxxOutputStream
		//문자기반 : xxxReader, xxxWriter
		//보조스트림 : 문자변환, 입출력성능향상, 기본데이터 타입 입출력
		//문자 변환 보조 스트림
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		
//		int readCnt;
//		char[] cbuf = new char[100];
//		while((readCnt = reader.read(cbuf)) != -1) {
//			String data = new String(cbuf,0,readCnt);
//			System.out.println(data);
//		}
//		reader.close();
		
		
		//기본데이터 타입(boolean, short, int , long,float,double) 입출력
		FileOutputStream fos = new FileOutputStream("D:/KCM/upload/file.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(2);
		dos.flush();

		dos.writeUTF("백두산");
		dos.writeDouble(88.8);
		dos.writeInt(2);
		dos.flush();

		dos.writeUTF("한라산");
		dos.writeDouble(77.7);
		dos.writeInt(3);
		dos.flush();
		
		dos.close();
		fos.close();
		
		//file.dat 파일을 읽어서 화면에 출력
		FileInputStream fis = new FileInputStream("D:/KCM/upload/file.dat");
		DataInputStream dis = new DataInputStream(fis);

//		int disBytes=0;
//		while(dis.read() != -1) {
//			dis.readByte();
//			disBytes++;
//		}
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int num = dis.readInt();
			System.out.println(name + ", " + score + ", " + num);
		}
		dis.close();
		fis.close();
		
		
		//객체 입출력 보조스트림
		fos = new FileOutputStream("D:/KCM/upload/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//직렬화 객체만 저장 가능
		Member member = new Member();
		member.setAge(10);
		member.setGender('F');
		member.setId("joy");
		
		oos.writeObject(member);
		oos.writeObject(new String("홍길동"));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new Double(1.12));
		
		oos.close();
		fos.close();
		
		//역직렬화 하여 객체 참조
		fis = new FileInputStream("D:/KCM/upload/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member m = (Member) ois.readObject();
		String name = (String)ois.readObject();
		int[] obj3 = (int[])ois.readObject();
		Double obj4 = (Double)ois.readObject();
		
		
		System.out.println(m.getId());
		System.out.println(m.getGender());
		System.out.println(m.getAge());
		System.out.println(name);
		System.out.println(obj3[0] + ", " + obj3[1] + ", " + obj3[2]);
		System.out.println(obj4);
		
	}
	
}

















