package controller;

import model.BulletAdapter;
import model.BulletModelInterface;
import view.BulletView;
import view.DJView;

public class BulletController implements ControllerInterface {

	BulletModelInterface model;
	DJView view;

	public BulletController(BulletModelInterface model) {
		this.model = model;
		view = new DJView(this, new BulletAdapter(model));
		view.createView();
		view = new BulletView(this, new BulletAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}

	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	public void increaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm - 10);
	}

	public void decreaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm + 10);
	}

	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
