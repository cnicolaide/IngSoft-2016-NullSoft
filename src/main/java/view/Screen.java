package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Screen extends Canvas implements Runnable {
	private int x, y, delay, bulletSize;
	Thread thread;

	public Screen(int x, int y, int bulletSize) {
		thread = new Thread(this);
		thread.start();
		setSize(x, y);
		this.bulletSize = bulletSize;
		setBackground(Color.gray);
		getBounds();
	}

	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, bulletSize, bulletSize);
	}

	public void run() {
		for (;;) {
			repaint();
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
			}
			;
		}
	}

	void setDelay(int delay) {
		this.delay = delay;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}

}