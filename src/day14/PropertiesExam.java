package day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExam {
	public static void main(String[] args) {
		Properties pro = new Properties();
		String path = PropertiesExam.class.getResource("database.properties").getPath(); //Properties가 어디있는지 알아오는 방법
		
		System.out.println(path);
		
		try {
			path = URLDecoder.decode(path, "utf-8");
			pro.load(new FileReader(path));
			
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String id = pro.getProperty("id");
			String pw = pro.getProperty("pw");
			
			System.out.println("드라이버 : " +driver + ", url " + url + ", id : " + id + ", pw : " + pw);
		
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
