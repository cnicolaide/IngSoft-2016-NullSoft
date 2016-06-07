package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ControllerInterface;
import model.BeatModelInterface;
import model.BulletObserver;

@SuppressWarnings("serial")
public class BulletView2 implements BulletObserver {

	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	private Rectangle rect;

	public BulletView2(ControllerInterface controller, BeatModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BulletObserver) this);
	}

	public void createView() {
		viewFrame = new JFrame("Bullet View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(200, 200);
		rect = viewFrame.getBounds();
		Screen p = new Screen((int) rect.width, (int) rect.height);
		viewFrame.getContentPane().add(p);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}

	public void updateBPM() {
		 if (model != null) {
System.out.println("CON ESTO ACTUALIZO LA PUTA VISTA");
//		 setX(model.getPointsX());
//		 setY(model.getPointsY());
		 //dir = model.dir();
		 }
	}
}
