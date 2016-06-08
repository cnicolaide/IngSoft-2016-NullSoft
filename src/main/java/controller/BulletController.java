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
		model.initialize();
	}

	public void start() {
		model.on();
	}

	public void stop() {
		model.off();
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
