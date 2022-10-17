package day16;

import java.awt.Toolkit;

public class ThreadExam {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<100; i++) {
			toolkit.beep();
			try {
				System.out.println("똥");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				System.out.println("띵");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
