package view;

import java.awt.*;

@SuppressWarnings("serial")
public class Screen extends Canvas implements Runnable {
	private int x, y;

	Thread thread;

	public Screen(int x, int y) {
		thread = new Thread(this);
		thread.start();
		setSize(x, y);
		setBackground(Color.gray);
		getBounds();
	}

	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, 20, 20);
	}

	public void run() {
		// for (;;) {
		// int value = getValue();
		// value = (int) (value * .75);
		// setValue(value);
		repaint();
		// try {
		// Thread.sleep(50);
		// } catch (Exception e) {
		// }
		// ;
		// }
	}
	
	void setX (int x){
		this.x = x;
	}
	
	void setY (int y){
		this.y = y;
	}

//	void setDIR (int dir){
//		this.dir = dir;
//	}
}