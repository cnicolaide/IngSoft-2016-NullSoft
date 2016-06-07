package model;

import java.awt.Canvas;
import java.awt.Rectangle;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class BulletModel extends Canvas implements BulletModelInterface, Runnable {

	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	ArrayList bulletObservers = new ArrayList();
	
	String type = "Bullet";

	private Rectangle rect;
	private int x, y, dir;
	private Thread thread;
	private boolean running;

	public String getType() {
		return type;
	}

	public BulletModel() {
		setSize(200, 200);
		rect = getBounds();
		this.start();
	}

	@SuppressWarnings("static-access")
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
				notifyBeatObservers();
				notifyBPMObservers();
				notifyBulletObservers();
				repaint();
				thread.sleep(250);
			}
		} catch (InterruptedException e) {
			running = false;
		}
	}

	public void start() {
		if (thread == null) {
			x = getPointsX();
			y = getPointsY();
			dir = dir();
			running = true;
			thread = new Thread(this);
			thread.start();
		}
	}

	private int getPointsX() {
		int num;
		do {
			num = (int) Math.round(Math.random() * 10000);
		} while (num >= rect.width - 12);
		return num;
	}

	private int getPointsY() {
		int num;
		do {
			num = (int) Math.round(Math.random() * 10000);
		} while (num >= rect.height - 12);
		return num;
	}

	private int dir() {
		int num;
		do {
			num = (int) Math.round(Math.random() * 10);
		} while ((num > 4) || (num == 0));
		return num;
	}

	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	public void notifyBeatObservers() {
		for (int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver) beatObservers.get(i);
			observer.updateBeat();
		}
	}

	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	public void notifyBPMObservers() {
		for (int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver) bpmObservers.get(i);
			observer.updateBPM();
		}
	}

	public void registerObserver(BulletObserver o) {
		bulletObservers.add(o);
	}

	public void removeObserver(BulletObserver o) {
		int i = bulletObservers.indexOf(o);
		if (i >= 0) {
			bulletObservers.remove(i);
		}
	}

	public void notifyBulletObservers() {
		for (int i = 0; i < bulletObservers.size(); i++) {
			BulletObserver observer = (BulletObserver) bulletObservers.get(i);
			observer.updateBPM();
		}
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getX() {
		return x;
	}
}
