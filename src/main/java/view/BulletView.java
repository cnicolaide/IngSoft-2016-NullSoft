package view;

import java.awt.*;
import javax.swing.*;

public class BulletView extends JFrame {

	private Rectangle rect;

	BulletView() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rect = getBounds();
		pantalla p = new pantalla((int) rect.width, (int) rect.height);
		getContentPane().add(p);
		pack();
		setVisible(true);
		p.start();
	}

	public static void main(String args[]) {
		new BulletView();
	}
}

class pantalla extends Canvas implements Runnable {

	private Rectangle rect;
	private int x, y, dir;
	private Thread t;
	private boolean running;

	/* Constructor de pantalla */
	pantalla(int x, int y) {
		setSize(x, y);
		setBackground(Color.yellow);
		rect = getBounds();
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, 20, 20);
	}

	public void run() {
		try {
			while (running) {
				if (dir == 1) {
					x--;
					y--;
					if (x == 0)
						dir = 2;
					if (y == 0)
						dir = 4;
				}
				if (dir == 2) {
					x++;
					y--;
					if (x == (rect.width - 12)) // Es menos 12 por el diametro
												// de la pelotita
						dir = 1;
					if (y == 0)
						dir = 3;
				}
				if (dir == 3) {
					x++;
					y++;
					if (x == (rect.width - 12))
						dir = 4;
					if (y == (rect.height - 12))
						dir = 2;
				}
				if (dir == 4) {
					x--;
					y++;
					if (x == 0)
						dir = 3;
					if (y == (rect.height - 12))
						dir = 1;
				}
				System.out.println(" -> " + x + " " + y + " " + dir);
				repaint();
				t.sleep(255);
			}
		} catch (InterruptedException e) {
			running = false;
		}
	}

	public void start() {
		if (t == null) {
			x = getPointsX();
			y = getPointsY();
			dir = dir();
			running = true;
			t = new Thread(this);
			t.start();
		}
	}

	/* Metodo que da la coordenada X inicial */
	private int getPointsX() {
		int num;
		do {
			num = (int) Math.round(Math.random() * 10000);
		} while (num >= rect.width - 12);
		return num;
	}

	/* Metodo que da la coordenada Y inicial */
	private int getPointsY() {
		int num;
		do {
			num = (int) Math.round(Math.random() * 10000);
		} while (num >= rect.height - 12);
		return num;
	}

	/* Metodo que da la direccion inicial de la bolita */
	private int dir() {
		int num;
		do {
			num = (int) Math.round(Math.random() * 10);
		} while ((num > 4) || (num == 0));
		return num;
	}

}