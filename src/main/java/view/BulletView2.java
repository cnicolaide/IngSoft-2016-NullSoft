package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BulletView2 extends JFrame {

	private Rectangle rect;

	BulletView2() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rect = getBounds();
		pantalla p = new pantalla((int) rect.width, (int) rect.height);
		getContentPane().add(p);
		pack();
		setVisible(true);
		// p.start();
	}

	public static void main(String args[]) {
		new BulletView2();
	}

	class pantalla extends Canvas implements Runnable {

		private Rectangle rect;
		private int x, y;
		pantalla(int x, int y) {
			setSize(x, y);
			setBackground(Color.yellow);
			rect = getBounds();
		}

		public void paint(Graphics g) {
			g.setColor(Color.blue);
			g.fillOval(x, y, 20, 20);
		}

		@Override
		public void run() {

		}
	}
}
