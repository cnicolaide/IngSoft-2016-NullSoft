package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.ControllerInterface;
import model.BeatModelInterface;

public class BulletView extends DJView {

	public BulletView(ControllerInterface controller, BeatModelInterface model) {
		super(controller, model);
		this.controller = controller;
		this.model = model;
	}

	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	Screen p;

	public void createView() {
		viewFrame = new JFrame("View");
		viewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		viewFrame.setSize(model.getFormSize(), model.getFormSize());
		p = new Screen(model.getFormSize(), model.getFormSize(), model.getBulletSize());
		viewPanel = new JPanel(new GridLayout(1, 1));
		bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		JPanel bpmPanel = new JPanel(new GridLayout(1, 1));
		bpmPanel.add(bpmOutputLabel);
		viewPanel.add(bpmPanel);
		viewFrame.getContentPane().add(p);
		viewFrame.getContentPane().add(viewPanel, BorderLayout.AFTER_LAST_LINE);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}

	public void updateBPM() {
		if (model != null) {
			p.setX(model.getPosX());
			p.setY(model.getPosY());
			p.setDelay(model.getBPM());
			bpmOutputLabel
					.setText("Delay: " + model.getBPM() + " Posicion: " + model.getPosX() + ", " + model.getPosY());
		}
	}
}
