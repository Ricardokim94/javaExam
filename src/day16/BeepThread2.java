package day16;

import java.awt.Toolkit;

public class BeepThread2 extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<100; i++) {
			toolkit.beep();
			try {
				System.out.println("띵2");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	
		super.run();
	}

	
}
