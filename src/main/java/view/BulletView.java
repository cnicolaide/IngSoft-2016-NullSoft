package view;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ControllerInterface;
import model.BeatModelInterface;
import model.BulletObserver;

public class BulletView implements BulletObserver {

	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	Screen p;
	private Rectangle rect;

	public BulletView(ControllerInterface controller, BeatModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BulletObserver) this);
	}

	public void createView() {
		viewFrame = new JFrame("Bullet View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(model.getFormSize(), model.getFormSize());
		rect = viewFrame.getBounds();
		p = new Screen((int) rect.width, (int) rect.height, model.getBulletSize());
		viewFrame.getContentPane().add(p);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}

	public void updateBPM() {
		if (model != null) {
			p.setX(model.getPosX());
			p.setY(model.getPosY());
			p.setDelay(model.getBPM());
		}
	}
}
