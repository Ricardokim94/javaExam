package day16;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<100; i++) {
			toolkit.beep();
			try {
				System.out.println("띵1");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	}
}
