package view;

import java.awt.*;
import javax.swing.*;

public class BulletView extends JFrame {

	private Rectangle rect;

	BulletView() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rect = getBounds(); // Para obtener las medidas del JFrame
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
	private int x;
	private int y;
	private int dir;
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
				// System.out.println(" -> " + x + " " + y + " " + dir);
				repaint();
				t.sleep(5);
			}
		} catch (InterruptedException e) {
			running = false;
		}
	}

	public void start() {
		if (t == null) {
			x = getPointsX();
			y = getPointsY();
			/*
			 * Con el metodo "dir()" obtengo la direccion inicial de la pelota
			 * Lo maneje como un plano cartesiano en forma de X... A ver si me
			 * explico jejejeje!!!!!
			 */
			dir = dir();
			running = true;
			t = new Thread(this);
			t.start();
		}
	}

	public void update(Graphics g) {
		/*
		 * Esto lo obtuve de un ejemplo: Segun yo... esto me limpia la pantalla
		 * para asi poder dibujar en el canvas el objeto en su nueva posicion.
		 * Si esto no se hace... el objeto dibujado con anterioridad aparecera y
		 * sera sobre-dibujado Pero si alguien sabe exactamente que rollo con
		 * esto que me lo explique; arriba tengo mis correos U_U
		 */
		rect = getBounds();
		Image image = createImage(rect.width, rect.height);
		Graphics gi = image.getGraphics();
		gi.clearRect(0, 0, rect.width, rect.height);
		paint(gi);
		g.drawImage(image, 0, 0, null);
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